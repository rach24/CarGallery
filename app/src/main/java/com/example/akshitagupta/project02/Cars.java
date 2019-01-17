package com.example.akshitagupta.project02;

public class Cars {
    private String brand;
    private int image;

    public Cars(String brand, int image){
        //contructor
        this.brand= brand;
        this.image=image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
