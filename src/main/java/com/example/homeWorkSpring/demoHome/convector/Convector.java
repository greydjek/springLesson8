package com.example.homeWorkSpring.demoHome.convector;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class Convector {

    public DtoProducts entityToDto(ProductModel productModel){
    return new DtoProducts(productModel);
        }
public ProductModel dtoToEntity(DtoProducts dtoProducts){
        return new ProductModel(dtoProducts);
}


}
