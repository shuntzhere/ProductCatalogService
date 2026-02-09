package dev.masoom.productcatalogservice.services;

import dev.masoom.productcatalogservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakestoreProductService implements IProductService{


    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product input) {
        return null;
    }
}
