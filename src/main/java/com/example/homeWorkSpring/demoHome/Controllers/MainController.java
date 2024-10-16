package com.example.homeWorkSpring.demoHome.Controllers;

import com.example.homeWorkSpring.demoHome.Model.ProductModel;
import com.example.homeWorkSpring.demoHome.Repository.Bascet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private Bascet bascet;

    public MainController(Bascet bascet) {
        this.bascet = bascet;
    }

    @GetMapping("/add")
    @ResponseBody
    public int add(@RequestParam int a, @RequestParam(required = true) int b) {
        int resault = a + b;
        return resault;
    }

    @GetMapping("/add2/{id}/pr")
    @ResponseBody
    public String add2(@PathVariable int id) {
        return "Product number " + id;
    }

    @GetMapping("/products")
    public String showProd(Model model) {
        model.addAttribute("pr" , bascet.getAllProducts());
        return "products";
    }
    @GetMapping("/products/{id}")
public String findOneProd(@PathVariable long id, Model model){
model.addAttribute("prodOne" , bascet.findById(id));
return "productInfo";
    }
}
