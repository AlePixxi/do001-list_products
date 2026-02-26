package com.do001.list_products.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int productTypeId;
    private int quantity;
    private double price;
    private String imageUrl;
}
