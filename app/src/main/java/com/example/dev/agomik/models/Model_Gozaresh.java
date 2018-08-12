package com.example.dev.agomik.models;

public class Model_Gozaresh {

    int mimage;
    String mtime;
    String mData;


    public Model_Gozaresh(int image, String time, String data) {
        this.mimage = image;
        this.mtime = time;
        mData = data;
    }


    public int getImage() {
        return mimage;
    }

    public void setImage(int image) {
        this.mimage = image;
    }

    public String getTime() {
        return mtime;
    }

    public void setTime(String time) {
        this.mtime = time;
    }

    public String getData() {
        return mData;
    }

    public void setData(String data) {
        mData = data;
    }
}
