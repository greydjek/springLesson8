package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.model.ProductModel;
import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
import com.example.homeWorkSpring.demoHome.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductSevice {
    private ProductCommand productCommand;
    private ProductRepository  productRepository;

    public ProductSevice(ProductCommand productCommand) {
        this.productCommand = productCommand;
    }

    public void saveProduct(ProductModel productModel){
        productCommand.save(productModel);
    }
}
