package dev.masoom.productcatalogservice.controllers;

import dev.masoom.productcatalogservice.dtos.ProductRequestDto;
import dev.masoom.productcatalogservice.dtos.ProductResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    /*
       Get all products ("/products"), GET
       Get product by id ("/products/{id}"), GET
     */
    @PostMapping("/products")
    ProductResponseDto createProduct(@RequestBody ProductRequestDto product) {
        ProductResponseDto productResponseDto = new ProductResponseDto();

        return productResponseDto;
    }

    @GetMapping("/products/{id}")
    ProductResponseDto getProductById(@PathVariable("id") long id){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        // call the service layer to get the product by id
        return productResponseDto;
    }

    @GetMapping("/products")
    List<ProductResponseDto> getAllProducts(){
        List<ProductResponseDto> products = new ArrayList<>();
        // call the service layer for all products
        return products;
    }


}
