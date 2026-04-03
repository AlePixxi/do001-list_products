package com.do001.list_products.entity;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private int stock;
    private Map<String, String> attributes;
    private ArrayList<String> tags;
}
