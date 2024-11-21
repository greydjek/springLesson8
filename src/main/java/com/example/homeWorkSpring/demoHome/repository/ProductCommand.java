package com.example.homeWorkSpring.demoHome.repository;
import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductCommand extends JpaRepository<ProductModel, Long> {
    Optional<ProductModel> findById(Long id);

    ProductModel findByName(String name);

    void deleteById(Long id);
//@Query("select p from products p where p.price between ?1 and ?2 ")
    List<ProductModel> findAllByPriceBetween(Double min, Double max);
}
