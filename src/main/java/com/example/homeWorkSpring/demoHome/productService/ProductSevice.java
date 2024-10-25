package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.model.ProductModel;
import com.example.homeWorkSpring.demoHome.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductSevice {
    private ProductRepository productRepository;

    public ProductSevice(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<ProductModel> showProducts(){
      return   productRepository.getAllProducts();
    }
    public void deleteProductById(Long id){
        productRepository.delProductModelById(id);
    }

    public void changePriceById(Long id, Double delta) {
   ProductModel productModel =  productRepository.findById(id);
productModel.setPrice(productModel.getPrice()+delta);
    }
}
