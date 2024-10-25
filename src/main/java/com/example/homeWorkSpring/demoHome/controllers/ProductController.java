package com.example.homeWorkSpring.demoHome.controllers;

import com.example.homeWorkSpring.demoHome.model.ProductModel;
import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductSevice productSevice;

    public ProductController(ProductSevice productSevice) {
        this.productSevice = productSevice;
    }


    @GetMapping("/products")
    public List<ProductModel> showProd() {
        return productSevice.showProducts();
    }

    @GetMapping("/products/delete/{id}")
    public void deleteProductByID(@PathVariable Long id) {
        productSevice.deleteProductById(id);
    }
    @GetMapping("/products/changePrice")
    public void changePriceByID(@RequestParam Long id, @RequestParam Double delta) {
        productSevice.changePriceById(id, delta);
    }

}
