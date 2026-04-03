package com.do001.list_products.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.do001.list_products.entity.Product;

public interface ProductsRepository extends MongoRepository<Product, String>{
    List<Product> findByCategory(String category);    
}
