package com.do001.list_products.repository;

import org.springframework.data.repository.CrudRepository;

import com.do001.list_products.entity.Product;

public interface ProductsRepository extends CrudRepository<Product, Integer>{

    
}
