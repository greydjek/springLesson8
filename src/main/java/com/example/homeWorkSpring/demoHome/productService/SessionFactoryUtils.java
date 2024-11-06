package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {
private SessionFactory factory;

    public void init(){
factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
}
public Session getSession(){
return factory.getCurrentSession();
}
public void shutDown(){
    if (factory!= null){
factory.close();
    }
}
}
