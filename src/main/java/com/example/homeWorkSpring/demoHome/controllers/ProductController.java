package com.example.homeWorkSpring.demoHome.controllers;

import com.example.homeWorkSpring.demoHome.convector.Convector;
import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductSevice productSevice;
    private final Convector convector;
    private List<DtoProducts> listProductsInCart;

    @GetMapping
//    public  List<ProductModel> allProducts(){
//    return     productSevice.allProducts();
//    }
    public Page<DtoProducts> allProducts(
            @RequestParam(name = "p", defaultValue = "1") Integer page,
            @RequestParam(name = "max_price", required = false) Double maxPrice,
            @RequestParam(name = "min_price", required = false) Double minPrice,
            @RequestParam(name = "title_part", defaultValue = "1") String namePart
    ) {
        if (page < 1) page = 1;

        return productSevice.findAll(maxPrice, minPrice, namePart, page).map(p -> convector.entityToDto(p));
    }

    @GetMapping("/cart")
    public Stream<DtoProducts> shoppingCart() {
        return productSevice.allProducts().stream().map(DtoProducts::new);
    }

    @GetMapping("/addProductInCart/")
    public void addProductInCart(@PathVariable Long id) {
        log.info(" передан параметр " + id );
        DtoProducts dtoproduct = (DtoProducts) findById(id);
        listProductsInCart.add(dtoproduct);
    }

    @GetMapping("/productsInCart")
    public List<DtoProducts> productsInCart() {
List<DtoProducts> list = (List<DtoProducts>) productSevice.allProducts().stream().map(p -> convector.entityToDto(p));
return list;
        }

    @PostMapping
    public ProductModel saveNewProduct(@RequestBody ProductModel productModel) {
        return productSevice.saveProduct(productModel);
    }

    @GetMapping("/{id}")
    public Object findById(@PathVariable Long id) {
        return productSevice.findById(id).map(s -> new DtoProducts(s));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productSevice.deleteById(id);
    }

    @PutMapping("/changeProduct")
    public DtoProducts productsUpdate(@RequestBody DtoProducts dtoProducts) {
        ProductModel productModel = productSevice.update(dtoProducts);
        return convector.entityToDto(productModel);
    }
}

