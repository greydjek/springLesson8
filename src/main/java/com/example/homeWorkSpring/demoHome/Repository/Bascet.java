package com.example.homeWorkSpring.demoHome.Repository;

import com.example.homeWorkSpring.demoHome.Model.ProductModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Bascet {
    List<ProductModel> productModels;

    @PostConstruct
    void init() {
        productModels = List.of(
                new ProductModel("sugar", 1L, 45.55D),
                new ProductModel("bread", 2L, 30.55D),
                new ProductModel("water", 3L, 45.55D),
                new ProductModel("apple", 4L, 45.55D)
        );
    }

    public List<ProductModel> getAllProducts() {
        return Collections.unmodifiableList(productModels);
    }

    public ProductModel findById(long id) {
        return productModels.stream().filter(s ->  s.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("not find "));
    }
}
