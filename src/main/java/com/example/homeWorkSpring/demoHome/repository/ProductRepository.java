package com.example.homeWorkSpring.demoHome.repository;

import com.example.homeWorkSpring.demoHome.model.ProductModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ProductRepository {
    LinkedList<ProductModel> productModels = new LinkedList<>();
List<ProductModel> lproductModels;
//    @PostConstruct
//    void init() {
//        lproductModels = List.of(
//                new ProductModel(1L, "sugar", 45.55D),
//                new ProductModel(2L, "bread", 30.55D),
//                new ProductModel(3L, "water", 45.55D),
//                new ProductModel(4L, "apple", 45.55D)
//        );
//    productModels.addAll(lproductModels);
//    }

    public LinkedList<ProductModel> getAllProducts() {
        return productModels ;
    }

public void delProductModelById(Long id){
        productModels.removeIf(s-> s.getId() == id);
}

    public ProductModel findById(Long id) {
        ProductModel a;
        a = productModels.stream().filter(s->s.getId()== id).findFirst().get();
        return a;


    }
}
