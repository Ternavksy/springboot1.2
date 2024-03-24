package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
