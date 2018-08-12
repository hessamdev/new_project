package com.example.dev.agomik.models;

public class Home_RecyclerShop {

    int image;
    String rate;

    public Home_RecyclerShop(int image, String rate) {
        this.image = image;
        this.rate = rate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
