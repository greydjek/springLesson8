package com.example.homeWorkSpring.demoHome.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "infoAboutProduct")
public class InfoAboutProduct {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "structure")
    private String structure;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "expirationDataDays")
    private Integer expirationDataDays;
//
//    @OneToOne(mappedBy = "productKey")
//    private ProductModel productModel;

    public InfoAboutProduct() {
    }
//
//    public ProductModel getProductModel() {
//        return productModel;
//    }
//
//    public void setProductModel(ProductModel productModel) {
//        this.productModel = productModel;
//    }

    @Override
    public String toString() {
        return "InfoAboutModel{" +
                "structure='" + structure + '\'' +
                ", weight=" + weight +
                ", expirationDataDays=" + expirationDataDays +
                '}';
    }

//    public ProductModel getProductModel() {
//        return productModel;
//    }
//
//    public void setProductModel(ProductModel productModel) {
//        this.productModel = productModel;
//    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getExpirationDataDays() {
        return expirationDataDays;
    }

    public void setExpirationDataDays(Integer expirationDataDays) {
        this.expirationDataDays = expirationDataDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
