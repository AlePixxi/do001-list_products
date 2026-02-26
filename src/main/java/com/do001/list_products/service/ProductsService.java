package com.do001.list_products.service;

import org.springframework.stereotype.Service;

import com.do001.list_products.entity.Product;
import com.do001.list_products.repository.ProductsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductsService {

    private final ProductsRepository productsRepository;

    public Iterable<Product> getAllProducts() {
        return productsRepository.findAll();
    }
    
}
