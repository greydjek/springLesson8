package com.example.homeWorkSpring.demoHome.Model;

public class ProductModel {
    String name;
    long id;
    double price;

    public ProductModel(String name, long id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public ProductModel(String name) {
        this.name = name;
    }

    public ProductModel() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
