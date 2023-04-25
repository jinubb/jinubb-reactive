package com.reactive.reactivech3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public Mono<Product> findProduct() {
        return productRepository.findByProductId(1L);
    }

    public Mono<Product> findProductWithLog() {

        Hooks.onOperatorDebug();
        return productRepository.findByProductId(1L).log("findProductWithLog");
    }

    public Mono<Product> addProduct() {
        return productRepository.save(Product.builder().productId(1).productName("테스트상품").build());
    }

    public Product findProductWithBlock() {
        return productRepository.findByProductId(1L).log("findProductWithBlock").block();
    }
}
