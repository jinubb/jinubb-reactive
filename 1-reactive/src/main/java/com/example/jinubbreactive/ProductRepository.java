package com.example.jinubbreactive;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductRepository {
    public Flux<Product> findProducts() {
        return Flux.just(
            new Product(1, "고오급 상품", 10000),
            new Product(2, "저어급 상품", 1000)
        );
    }
}