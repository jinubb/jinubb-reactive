package com.example.reactivech2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/hello")
    Mono<String> world() {
        return Mono.just("Hello world!?");
    }

    @GetMapping("/product/{productId}")
    Mono<Product> findProduct(@PathVariable long productId) {
        return productService.findProduct(productId);
    }

    @PostMapping("/product/{productId}")
    Mono<Product> saveProduct(@PathVariable long productId, @RequestParam String productName) {
        return productService.saveProduct(productId, productName);
    }

    @PutMapping("/product/{productId}")
    Mono<Product> modifyProduct(@PathVariable long productId, @RequestParam String productName) {
        return productService.modifyProduct(productId, productName);
    }

}
