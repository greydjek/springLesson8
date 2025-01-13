package com.example.homeWorkSpring.demoHome.productValidator;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.exception.ValidationError;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductValidator {
public void validate(DtoProducts dtoProduct){
    List<String> listError= new ArrayList<>();
    if (dtoProduct.getName().isBlank()){
listError.add("название товара не может быть пустым ");
   }
if (dtoProduct.getPrice()<1){
    listError.add("цена не может быть меньше 1 ");
}
if (!listError.isEmpty()) {

    throw new ValidationError(listError);
}
}
}
