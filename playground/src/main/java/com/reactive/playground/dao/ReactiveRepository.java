package com.reactive.playground.dao;

import reactor.core.publisher.Flux;

public class ReactiveRepository<T> {
    public Flux<T> findAll() {
        return Flux.empty();
    }
}
