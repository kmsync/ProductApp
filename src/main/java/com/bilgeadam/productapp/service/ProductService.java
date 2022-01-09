package com.bilgeadam.productapp.service;

import com.bilgeadam.productapp.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long productId);
    void deleteProduct(long id);

}
