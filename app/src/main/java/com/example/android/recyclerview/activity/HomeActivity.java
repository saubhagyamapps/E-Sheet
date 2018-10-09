package com.example.android.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.recyclerview.R;
import com.example.android.recyclerview.adepter.ProjectListAdepter;
import com.example.android.recyclerview.model.NameModel;
import com.example.android.recyclerview.retrofit.ApiClient;
import com.example.android.recyclerview.retrofit.ApiInterface;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
  //  private ShimmerFrameLayout mShimmerViewContainer;

    ApiInterface apiService;
    TextView txtDatanotFound;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

   // LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    linearLayout = findViewById(R.id.linear);

      //  mShimmerViewContainer = findViewById(R.id.shimmer_view_container);
        intl();
    }

    @Override
    public void onResume() {
        super.onResume();
      //  mShimmerViewContainer.startShimmerAnimation();
    }

    @Override
    public void onPause() {
       // mShimmerViewContainer.stopShimmerAnimation();
        super.onPause();
    }

    private void intl() {
        apiService =
                ApiClient.getClient().create(ApiInterface.class);
        txtDatanotFound = (TextView) findViewById(R.id.txtDataNotFound);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleListView);
       // mLayoutManager = new GridLayoutManager(getApplicationContext(), 2);/*LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);*/
        mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        getData();
    }

    private void getData() {
        try {
            Call<NameModel> modelCall = apiService.getNameList();
            modelCall.enqueue(new Callback<NameModel>() {
                @Override
                public void onResponse(Call<NameModel> call, Response<NameModel> response) {

                    Gson mGson = new Gson();
                    String result = mGson.toJson(response);
                    Log.e("HomeActivity ", result);

                    if (response.body().getData().size() == 0) {
                        txtDatanotFound.setVisibility(View.VISIBLE);
                    } else {
                        Log.e("Size of getdata", response.body().getData().size() + "");
                        mAdapter = new ProjectListAdepter(response.body().getData(), getApplicationContext());

                        mRecyclerView.setHasFixedSize(true);
                        mAdapter.notifyDataSetChanged();
                        mRecyclerView.setAdapter(mAdapter);
                     //   mShimmerViewContainer.stopShimmerAnimation();
                     //   linearLayout.setVisibility(View.GONE);
                    }
                }

                @Override
                public void onFailure(Call<NameModel> call, Throwable t) {
                    Log.e(TAG, "onFailure: " );

                }
            });
        } catch (Exception e) {

        }
    }
}
