package com.example.android.recyclerview.model;

import java.util.List;

public class NameModel {
    /**
     * status : 0
     * msg : show Successfully
     * data : [{"names":"aryabhatt"},{"names":"yogesh"},{"names":"himanshu"},{"names":"bhargav"},{"names":"rahul"},{"names":"jignesh"},{"names":"narayan"},{"names":"alkesh"}]
     */

    private int status;
    private String msg;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * names : aryabhatt
         */

        private String names;

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }
    }
}
