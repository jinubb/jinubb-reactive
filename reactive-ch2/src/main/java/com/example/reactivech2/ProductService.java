package com.example.reactivech2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Mono<Product> findProduct(long productId) {
        return productRepository.findByProductId(productId);
    }

    public Mono<Product> saveProduct(long productId, String productName) {
        return productRepository.save(Product.builder()
            .productId(productId)
            .productName(productName)
            .build());
    }

    public Mono<Product> modifyProduct(long productId, String productName) {
        return this.findProduct(productId)
            .map((product) -> product.modifyName(productName))
            .flatMap(this.productRepository::save);
    }
}
