package com.example.homeWorkSpring.demoHome.productsCart;

import com.example.homeWorkSpring.demoHome.convector.Convector;
import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Component
public class Cart {
    List<DtoProducts> dtoProductsListInCart = new ArrayList<>();
    final ProductSevice productSevice;
    final Convector convector;

    public void addDtoProductsInCart(Long id) {
        dtoProductsListInCart.add(convector.entityToDto(productSevice.findById(id).orElseThrow(() -> new FindException("Этот товар не найден"))));
    }

    public void deleteProductInCart(Long id) {
        for (int i = 0; i < dtoProductsListInCart.toArray().length; i++) {
            if (dtoProductsListInCart.get(i).getId().equals(id)) {
                dtoProductsListInCart.remove(i);
            }
        }
    }

    public List<DtoProducts> getAllDtoProductsInCart() {
        return dtoProductsListInCart;
    }
}
