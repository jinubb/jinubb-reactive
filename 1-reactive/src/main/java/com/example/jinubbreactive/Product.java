package com.example.jinubbreactive;

import lombok.Getter;

@Getter
public class Product {
    private int id;
    private String name;
    private int price;
    private boolean isShow;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isShow = false;
    }

    public Product show() {
        this.isShow = true;
        return this;
    }
}
