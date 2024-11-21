package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
import jakarta.transaction.Transactional;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

@Service
public class ProductSevice {

    private ProductCommand productCommand;

    public ProductSevice(ProductCommand productCommand) {
        this.productCommand = productCommand;
    }

    public List<ProductModel> allProducts() {
        return productCommand.findAll();
    }

    public Optional<ProductModel> findById(Long id) {
        return productCommand.findById(id);
    }

    public void deleteById(Long id) {
        productCommand.deleteById(id);
    }

    public List<ProductModel> filterNewPrice(Double min, Double max) {
        return productCommand.findAllByPriceBetween(min, max);
    }

    @Transactional
    public void changePrice(Long id, Integer delta) {
        ProductModel productModel = productCommand.findById(id).orElseThrow(() -> new RuntimeException("this product not find"));
        productModel.setPrice(productModel.getPrice() + delta);
    }
}
