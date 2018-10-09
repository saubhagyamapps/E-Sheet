package com.example.android.recyclerview.model;

import java.util.List;



public class ResponseModel {
    /**
     * status : 0
     * msg : show Successfully
     * image_url : http://rajviinfotech.in/quotes/public/uploads/
     * data : [{"id":11,"quotes_image":"1529670359-navigation_cover.jpg","quotes_name":"Falsity in intellectual action is intellectual immorality.","authormanagement_id":2,"categorymanagement_id":9,"created_at":"2018-06-22 06:56:00","updated_at":"2018-06-22 06:56:00"},{"id":7,"quotes_image":"1529670263-images (13).jpg","quotes_name":"If only we could pull out our brain and use only our eyes.","authormanagement_id":2,"categorymanagement_id":6,"created_at":"2018-06-22 06:54:23","updated_at":"2018-06-22 06:54:23"},{"id":4,"quotes_image":"1529670186-download (4).jpg","quotes_name":"Hold fast to dreams, for if dreams die, life is a broken-winged bird that cannot fly.","authormanagement_id":2,"categorymanagement_id":2,"created_at":"2018-06-22 06:53:06","updated_at":"2018-06-22 06:53:06"},{"id":2,"quotes_image":"1529670148-b.jpg","quotes_name":"It is better to fail in originality than to succeed in imitation.","authormanagement_id":2,"categorymanagement_id":1,"created_at":"2018-06-22 06:52:28","updated_at":"2018-06-22 06:52:28"}]
     */

    private int status;
    private String msg;
    private String image_url;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 11
         * quotes_image : 1529670359-navigation_cover.jpg
         * quotes_name : Falsity in intellectual action is intellectual immorality.
         * authormanagement_id : 2
         * categorymanagement_id : 9
         * created_at : 2018-06-22 06:56:00
         * updated_at : 2018-06-22 06:56:00
         */

        private int id;
        private String quotes_image;
        private String quotes_name;
        private int authormanagement_id;
        private int categorymanagement_id;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuotes_image() {
            return quotes_image;
        }

        public void setQuotes_image(String quotes_image) {
            this.quotes_image = quotes_image;
        }

        public String getQuotes_name() {
            return quotes_name;
        }

        public void setQuotes_name(String quotes_name) {
            this.quotes_name = quotes_name;
        }

        public int getAuthormanagement_id() {
            return authormanagement_id;
        }

        public void setAuthormanagement_id(int authormanagement_id) {
            this.authormanagement_id = authormanagement_id;
        }

        public int getCategorymanagement_id() {
            return categorymanagement_id;
        }

        public void setCategorymanagement_id(int categorymanagement_id) {
            this.categorymanagement_id = categorymanagement_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
