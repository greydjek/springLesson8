package com.example.homeWorkSpring.demoHome.entity;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator" ,strategy = "increment")
    @GeneratedValue(generator = "generator")
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "price", nullable = false, scale = 2)
    Double price;

//    @OneToOne
//    @JoinColumn(name = "productKey")
//    private InfoAboutProduct productKey;

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public ProductModel() {
    }
public ProductModel(DtoProducts dtoProducts){
        this.name = dtoProducts.getName();
        this.price = dtoProducts.getPrice();
}
    public void setId(Long id) {
        this.id = id;
    }


    public void setPrice(Double price) {
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
