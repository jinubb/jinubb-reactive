package com.reactive.reactivech3;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    private String id;

    private String productName;
    private long productId;

    @Builder
    public Product(String id, String productName, long productId) {
        this.id = id;
        this.productName = productName;
        this.productId = productId;
    }

    public Product modifyName(String productName) {
        this.productName = productName;
        return this;
    }
}