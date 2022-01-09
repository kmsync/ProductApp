package com.bilgeadam.productapp.controller;

import com.bilgeadam.productapp.entity.Product;
import com.bilgeadam.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProduct()
    {
        return productService.getAllProducts();
    }

}