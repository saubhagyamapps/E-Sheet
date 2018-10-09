package com.example.android.recyclerview.adepter;

import android.content.Context;
import android.os.StrictMode;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.android.recyclerview.R;
import com.example.android.recyclerview.model.NameModel;
import java.util.List;

public class ProjectListAdepter extends RecyclerView.Adapter<ProjectListAdepter.ViewHolder> {
    private List<NameModel.DataBean> dataBeans;
    private Context context;
    private int count = 1;

   // private String postUrl = "https://api.androidhive.info/webview/index.html";

    public ProjectListAdepter(List<NameModel.DataBean> dataBeans, Context context) {
        this.dataBeans = dataBeans;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.projectlistrow, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.txtProjectName.setText(dataBeans.get(position).getNames() + "");
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }


    @Override
    public int getItemCount() {
        return dataBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtProjectName;
        CardView imageView;


        public ViewHolder(View itemView) {
            super(itemView);
            txtProjectName = (TextView) itemView.findViewById(R.id.txtProjectName);
            imageView = (CardView) itemView.findViewById(R.id.card_view);

        }
    }

}
