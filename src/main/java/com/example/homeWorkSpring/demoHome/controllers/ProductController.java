package com.example.homeWorkSpring.demoHome.controllers;

import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductSevice productSevice;

    public ProductController(ProductSevice productSevice) {
        this.productSevice = productSevice;
    }
    @GetMapping("/products/filterNewPrice")
public List<ProductModel> filterNewPrice(@RequestParam Double min, @RequestParam (defaultValue = "100.00") Double max ){
return productSevice.filterNewPrice(min, max);
    }
    @GetMapping("/products")
    public List<ProductModel> allProducts() {
        return productSevice.allProducts();
    }

    @GetMapping("/products/{id}")
    public Object findById(@PathVariable Long id) {
        return productSevice.findById(id);
    }
    @GetMapping("/products/delete/{id}")
    public void deleteById(@PathVariable Long id){
        productSevice.deleteById(id);
    }
    @GetMapping("/products/changePrice")
    public void changePrice(@RequestParam Long id, @RequestParam Integer delta){
productSevice.changePrice(id,delta);
    }

}

