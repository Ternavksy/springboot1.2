package com.example.productmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "product_on_stack")
public class ProductOnStack {

    @Id
    private String id;

    @DBRef
    private Product product;

    @DBRef
    private Stack stack;

    private int quantity;

    @Indexed(expireAfterSeconds = 0)
    private LocalDateTime expiryDate;

    // Конструкторы, геттеры и сеттеры
}
