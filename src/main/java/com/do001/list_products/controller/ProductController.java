package com.do001.list_products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.do001.list_products.entity.Product;
import com.do001.list_products.service.ProductsService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductsService productsService;
    
    @GetMapping("/list-products")
    public Iterable<Product> getAllProducts() {
        return productsService.getAllProducts();
    }
    
}
