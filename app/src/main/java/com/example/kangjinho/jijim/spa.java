package com.example.kangjinho.jijim;

/**
 * Created by Public on 2016-07-20.
 */
public class Spa {
    private int backImage;
    private String name;
    private String price;
    private String location;

    public Spa(int backImage, String name, String price, String location) {
        this.backImage = backImage;
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getBackImage() {
        return backImage;
    }

    public void setBackImage(int backImage) {
        this.backImage = backImage;
    }
}
