package com.example.reactivech2;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveCrudRepository<Product, String> {

    Mono<Product> findByProductId(long productId);
}
