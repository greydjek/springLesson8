package com.example.homeWorkSpring.demoHome.dto;

import com.example.homeWorkSpring.demoHome.entity.ProductModel;

public class DtoProducts {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DtoProducts(ProductModel productModel) {
        name = productModel.getName();
    price = productModel.getPrice();
    }

    public DtoProducts(){

    }
}
