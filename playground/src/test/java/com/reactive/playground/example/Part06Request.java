package com.reactive.playground.example;

//generic imports to help with simpler IDEs (ie tech.io)
import com.reactive.playground.dao.ReactiveRepository;
import com.reactive.playground.domain.User;
import java.util.*;
import java.util.function.*;
import java.time.*;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * Learn how to control the demand.
 *
 * @author Sebastien Deleuze
 */
public class Part06Request {

    /**
     이전에 다루지 않았던 측면 중 하나는 볼륨 제어입니다. Reactive Streams 용어로는 백프레셔(backpressure)라고도 합니다. 이는 Subscriber가 Publisher에게 처리할 수 있는 데이터 양을 알리는 피드백 메커니즘으로, Publisher가 데이터를 생성하는 속도를 제한합니다.

     요구 사항의 제어는 Subscription 수준에서 이루어집니다. 각 subscribe() 호출마다 Subscription이 생성되며, cancel()을 사용하여 데이터 흐름을 중단하거나 request(long)를 사용하여 수요를 조절할 수 있습니다.

     request(Long.MAX_VALUE)를 사용하면 무제한 요구 사항이 되므로, Publisher는 가장 빠른 속도로 데이터를 발행합니다.
     */

    ReactiveRepository<User> repository = new ReactiveRepository();

//========================================================================================

    // TODO Create a StepVerifier that initially requests all values and expect 4 values to be received
    StepVerifier requestAllExpectFour(Flux<User> flux) {
        return StepVerifier
            .create(flux)
            .thenRequest(4)
            .expectComplete();
    }

//========================================================================================

    // TODO Create a StepVerifier that initially requests 1 value and expects User.SKYLER then requests another value and expects User.JESSE then stops verifying by cancelling the source
    StepVerifier requestOneExpectSkylerThenRequestOneExpectJesse(Flux<User> flux) {
        return null;
    }

//========================================================================================

    // TODO Return a Flux with all users stored in the repository that prints automatically logs for all Reactive Streams signals
    Flux<User> fluxWithLog() {
        return null;
    }

//========================================================================================

    // TODO Return a Flux with all users stored in the repository that prints "Starring:" at first, "firstname lastname" for all values and "The end!" on complete
    Flux<User> fluxWithDoOnPrintln() {
        return null;
    }

}

