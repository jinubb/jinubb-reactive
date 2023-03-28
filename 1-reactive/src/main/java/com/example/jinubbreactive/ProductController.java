package com.example.jinubbreactive;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/subscribe")
    public Flux<Product> findProducts() {
        return productService.findProducts();
    }

    @GetMapping("/product/not/subscribe")
    public String findProductsNotSubscribe() {
        productService.findProducts();
        return "not subscribe";
    }
}
