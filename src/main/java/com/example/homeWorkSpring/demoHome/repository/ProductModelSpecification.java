package com.example.homeWorkSpring.demoHome.repository;

import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import org.springframework.data.jpa.domain.Specification;

public class ProductModelSpecification {
    public static Specification<ProductModel> priceGreaterThanOrEqualTo (Double price){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price);
    }
    public static Specification<ProductModel> priceLessThanOrEqualTo (Double price){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
    }
    public static Specification<ProductModel> nameLike (String namePart){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("name"),String.format("%%s%%", namePart));
    }
}
