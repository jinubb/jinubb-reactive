package com.example.jinubbreactive;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Flux<Product> findProducts() {
        return productRepository.findProducts()
            .doOnNext(product -> System.out.println(String.format("[%s] 상품을 조회했습니다", product.getName())))
            .doOnError(error -> System.out.println("에러 발생 : " + error.getMessage()))
            .map(Product::show)
            .log("로그입니다");
    }
}
