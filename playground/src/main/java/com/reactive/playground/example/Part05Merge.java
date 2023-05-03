package com.reactive.playground.example;

import com.reactive.playground.domain.User;
import java.util.*;
import java.util.function.*;
import java.time.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to merge flux.
 *
 * @author Sebastien Deleuze
 */
public class Part05Merge {

//========================================================================================
    // 시퀀스(Sequence) 병합은 여러 개의 Publisher에서 값들을 수신하고 하나의 Flux로 발행하는 연산을 말합니다.
//
//이 첫 번째 연습에서는 두 개의 Flux에서 값들이 도착하는 대로 병합하는 것부터 시작합니다. 이때 주의할 점은 flux1에서의 값이 지연되어 도착한다는 것입니다. 따라서 결과적인 Flux에서는 flux2의 값이 먼저 보이게 됩니다.
    // TODO Merge flux1 and flux2 values with interleave
    Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
        return flux1.mergeWith(flux2);
    }

//========================================================================================

    // 하지만 만약 소스의 순서를 유지하려면, concat 연산자를 사용할 수 있습니다. Concat은 flux1이 완료될 때까지 기다렸다가 flux2를 구독하므로, flux1에서 모든 값이 발행된 후에 flux2에서 발행된 값이 발행되도록 보장하여 소스에 해당하는 순서를 유지합니다.
    // TODO Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
        return flux1.concatWith(flux2);
    }

//========================================================================================

    // 여러 개의 Publisher와 concat을 사용할 수 있습니다. 예를 들어, 두 개의 Mono를 가져와서 동일한 순서의 Flux로 변환할 수 있습니다.
    // TODO Create a Flux containing the value of mono1 then the value of mono2
    Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
        return mono1.concatWith(mono2);
    }

}

