package dev.masoom.productcatalogservice.controllers;

import dev.masoom.productcatalogservice.dtos.ProductDto;
import dev.masoom.productcatalogservice.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    IProductService productService;
    /*
       Get all products ("/products"), GET
       Get product by id ("/products/{id}"), GET
     */
    @PostMapping("/products")
    ProductDto createProduct(@RequestBody ProductDto product) {
        ProductDto productResponseDto = new ProductDto();

        return productResponseDto;
    }

    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") long id){
        ProductDto productResponseDto = new ProductDto();
        // call the service layer to get the product by id
        return productResponseDto;
    }

    @GetMapping("/products")
    List<ProductDto> getAllProducts(){
        List<ProductDto> products = new ArrayList<>();
        // call the service layer for all products
        return products;
    }


}
