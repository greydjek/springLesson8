package com.example.homeWorkSpring.demoHome.repository;
import com.example.homeWorkSpring.demoHome.model.ProductModel;

public interface ProductCommand{
ProductModel findById(Long id);
ProductModel findByName(String name);
}
