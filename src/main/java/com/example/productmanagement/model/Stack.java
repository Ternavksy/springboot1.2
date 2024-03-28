package com.example.productmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stacks")
@CompoundIndex(def = "{'location': 1, 'shelf': 1}", name = "location_shelf_index")
public class Stack {

    @Id
    private String id;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String location;

    @Indexed(direction = IndexDirection.ASCENDING)
    private String shelf;

    // Конструкторы, геттеры и сеттеры
}
