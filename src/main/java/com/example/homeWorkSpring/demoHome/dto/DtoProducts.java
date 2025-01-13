package com.example.homeWorkSpring.demoHome.dto;

import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoProducts {
    private String name;
    private double price;
    private Long id;

    public DtoProducts(ProductModel productModel) {
        this.name = productModel.getName();
        this.price = productModel.getPrice();
    }
}
