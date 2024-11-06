package com.example.homeWorkSpring.demoHome.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator" ,strategy = "increment")
    @GeneratedValue(generator = "generator")

    Long id;
@Column(name = "price", nullable = false, scale = 2)
    Double price;
@Column(name = "name", nullable = false)
    String name;

    @OneToOne
    @JoinColumn(name = "productKey")
    private InfoAboutProduct productKey;

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

    public InfoAboutProduct getProductKey() {
        return productKey;
    }

    public void setProductKey(InfoAboutProduct productKey) {
        this.productKey = productKey;
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

    public void setPrice(double price) {
        this.price = price;
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
