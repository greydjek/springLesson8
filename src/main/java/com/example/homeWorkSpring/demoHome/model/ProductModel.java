package com.example.homeWorkSpring.demoHome.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class ProductModel {
    @Id
    @Column(name = "idProduct")
    @GenericGenerator(name = "generator" ,strategy = "increment")
    @GeneratedValue(generator = "generator")

    Long id;
@Column(name = "price", nullable = false, scale = 2)
    Double price;
@Column(name = "product_name", nullable = false)
    String name;

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public ProductModel(String name) {
        this.name = name;
    }

    public ProductModel() {
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
