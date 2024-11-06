package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.model.ProductModel;
import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
import org.hibernate.Session;


import java.util.List;
public class ProductSevice implements ProductCommand {

private SessionFactoryUtils sessionFactoryUtils;
    public ProductSevice() {

    }

    public ProductSevice(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }

    public void saveProduct(ProductModel productModel){
    }

    @Override
    public ProductModel findById(Long id) {
try (Session session = sessionFactoryUtils.getSession()){
session.beginTransaction();
ProductModel productModel =session.get(ProductModel.class, id);
session.getTransaction().commit();
    System.out.println(productModel.toString());
    return productModel;
}
    }

    @Override
    public ProductModel findByName(String name) {
try (Session session = sessionFactoryUtils.getSession()){
    session.beginTransaction();
ProductModel productModel = session.createQuery("select pr from Products where pr.name = :name", ProductModel.class)
        .setParameter("name" , name)
        .getSingleResult();
session.getTransaction().commit();
return productModel;

}
    }
}
