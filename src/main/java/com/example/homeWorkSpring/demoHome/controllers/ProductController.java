package com.example.homeWorkSpring.demoHome.controllers;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductSevice productSevice;

    public ProductController(ProductSevice productSevice) {
        this.productSevice = productSevice;
    }
    @GetMapping("/filterNewPrice")
public Stream<DtoProducts> filterNewPrice(@RequestParam Double min, @RequestParam (defaultValue = "100.00") Double max ){
return productSevice.filterNewPrice(min, max).stream().map(s-> new DtoProducts(s));
    }
    @GetMapping
    public List<ProductModel> allProducts() {
        return productSevice.allProducts();
    }
    @GetMapping("/cart")
    public Stream<DtoProducts> shoppingCart(){
return productSevice.allProducts().stream().map(DtoProducts::new);
    }
@PostMapping
public ProductModel saveNewProduct(@RequestBody ProductModel productModel){
        return productSevice.saveProduct(productModel);
}

    @GetMapping("/{id}")
    public Object findById(@PathVariable Long id) {
        return productSevice.findById(id).map(s-> new DtoProducts(s));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        productSevice.deleteById(id);
    }
    @PutMapping("/changePrice")
    public void changePrice(@RequestParam Long id, @RequestParam Integer delta){
productSevice.changePrice(id,delta);
    }

}

