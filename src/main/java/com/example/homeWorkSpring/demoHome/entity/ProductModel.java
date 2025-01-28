package com.example.homeWorkSpring.demoHome.entity;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Setter
@Getter
@Entity
@Table(name = "product_model")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "price")
    Double price;


    public ProductModel() {
    }

    public ProductModel(DtoProducts dtoProducts) {
        this.name = dtoProducts.getName();
        this.price = dtoProducts.getPrice();
    }
}
