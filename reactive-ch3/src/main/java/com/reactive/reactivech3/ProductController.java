package com.reactive.reactivech3;

import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/hello/log")
    Mono<String> worldWithLog() {
        return Mono.just("Hello world!?").log();
    }

    @GetMapping("/product")
    Mono<Product> findProduct() {
        return productService.findProduct();
    }

    @GetMapping("/product/log")
    Mono<Product> findProductWithLog() {
        return productService.findProductWithLog();
    }

    @GetMapping("/product/block")
    Product findProductWithBlock() {
        return productService.findProductWithBlock();
    }

    @GetMapping("/hello/sleep")
    Long helloSleep() {
        return Mono.delay(Duration.ofSeconds(1))
            .doOnNext(it -> {
                try {
                    Thread.sleep(60);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            })
            .block();
    }

    @PostMapping("/product")
    Mono<Product> addProduct() {
        return productService.addProduct();
    }
}
