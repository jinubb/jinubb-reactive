package com.reactive.playground.example;

//generic imports to help with simpler IDEs (ie tech.io)
import com.reactive.playground.domain.User;
import java.util.*;
import java.util.function.*;
import java.time.*;

import java.util.concurrent.CompletableFuture;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to adapt from/to RxJava 3 Observable/Single/Flowable and Java 8+ CompletableFuture.
 *
 * Mono and Flux already implements Reactive Streams interfaces so they are natively
 * Reactive Streams compliant + there are {@link Mono#from(Publisher)} and {@link Flux#from(Publisher)}
 * factory methods.
 *
 * For RxJava 3, you should not use Reactor Adapter but only RxJava 3 and Reactor Core.
 *
 * @author Sebastien Deleuze
 */
public class Part09Adapt {

//========================================================================================

    // TODO Adapt Flux to RxJava Flowable
    Flowable<User> fromFluxToFlowable(Flux<User> flux) {
        return null;
    }

    // TODO Adapt RxJava Flowable to Flux
    Flux<User> fromFlowableToFlux(Flowable<User> flowable) {
        return null;
    }

//========================================================================================

    // TODO Adapt Flux to RxJava Observable
    Observable<User> fromFluxToObservable(Flux<User> flux) {
        return null;
    }

    // TODO Adapt RxJava Observable to Flux
    Flux<User> fromObservableToFlux(Observable<User> observable) {
        return null;
    }

//========================================================================================

    // TODO Adapt Mono to RxJava Single
    Single<User> fromMonoToSingle(Mono<User> mono) {
        return null;
    }

    // TODO Adapt RxJava Single to Mono
    Mono<User> fromSingleToMono(Single<User> single) {
        return null;
    }

//========================================================================================

    // TODO Adapt Mono to Java 8+ CompletableFuture
    CompletableFuture<User> fromMonoToCompletableFuture(Mono<User> mono) {
        return null;
    }

    // TODO Adapt Java 8+ CompletableFuture to Mono
    Mono<User> fromCompletableFutureToMono(CompletableFuture<User> future) {
        return null;
    }

}
