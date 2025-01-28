package com.example.homeWorkSpring.demoHome.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "infoAboutProduct")
public class InfoAboutProduct {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "days")
    private Integer expirationDataDays;

    public InfoAboutProduct() {
    }

    @Override
    public String toString() {
        return "InfoAboutModel{" +
                "structure='" + name + '\'' +
                ", weight=" + weight +
                ", expirationDataDays=" + expirationDataDays +
                '}';
    }
}
