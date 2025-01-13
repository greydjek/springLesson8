package com.example.homeWorkSpring.demoHome.productService;

import com.example.homeWorkSpring.demoHome.dto.DtoProducts;
import com.example.homeWorkSpring.demoHome.entity.ProductModel;
import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
import com.example.homeWorkSpring.demoHome.repository.ProductModelSpecification;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.lang.module.FindException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductSevice {

    private final ProductCommand productCommand;

    public List<ProductModel> allProducts() {
        return productCommand.findAll();
    }

    public Optional<ProductModel> findById(Long id) {
        return productCommand.findById(id);
    }

    public void deleteById(Long id) {
        productCommand.deleteById(id);
    }

    public List<ProductModel> filterNewPrice(Double min, Double max) {
        return productCommand.findAllByPriceBetween(min, max);
    }
    public Page<ProductModel> findAll(Double maxPrice, Double minPrice, String namePart, Integer page){
        Specification<ProductModel> specification = Specification.where(null);
        if(maxPrice!= null){
            specification = specification.and(ProductModelSpecification.priceGreaterThanOrEqualTo(maxPrice));
        }if(minPrice!= null){
            specification = specification.and(ProductModelSpecification.priceLessThanOrEqualTo(minPrice));
        }if(maxPrice!= null){
            specification = specification.and(ProductModelSpecification.nameLike(namePart));
        }

        return productCommand.findAll(specification, PageRequest.of(page -1, 5));
    }


    public ProductModel saveProduct(ProductModel productModel) {
    productCommand.save(productModel);
        return productModel;
    }
    @Transactional
public ProductModel update(DtoProducts dtoProducts){
ProductModel productModel =  productCommand.findById(dtoProducts.getId()).orElseThrow(()-> new FindException("не нaйден в базе"+ dtoProducts.getId()));
productModel.setPrice(dtoProducts.getPrice());
        productModel.setName(dtoProducts.getName());
    return productModel;
    }
}
