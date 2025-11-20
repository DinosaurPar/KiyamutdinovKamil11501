package org.example;

public class Product {
    String name;
    double price;

    Category category;
    String img;
    String components;
    boolean isAvailable;
    int time;

    public Product(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}