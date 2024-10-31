package com.example.homeWorkSpring.demoHome.repository;
import com.example.homeWorkSpring.demoHome.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommand extends JpaRepository<ProductModel , Long> {

}
