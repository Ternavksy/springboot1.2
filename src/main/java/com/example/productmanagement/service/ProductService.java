package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
    public void generateAndSaveProducts(int numberOfProducts) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < numberOfProducts; i++) {
            Product product = new Product();
            product.setName("Product " + i);
            product.setDescription("Description for product " + i + " with some unique details " + UUID.randomUUID().toString());
            product.setPrice(Math.random() * 100 + 1); // Генерация случайной цены от 1 до 100
            productList.add(product);
        }
        productRepository.saveAll(productList);
    }
}
