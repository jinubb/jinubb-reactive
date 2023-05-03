package com.reactive.playground.example;

//generic imports to help with simpler IDEs (ie tech.io)
import com.reactive.playground.domain.User;

import java.util.Arrays;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to transform values.
 *
 * @author Sebastien Deleuze
 */
public class Part04Transform {

//========================================================================================

    // TODO Capitalize the user username, firstname and lastname
    Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(user.getUsername().toUpperCase(), user.getFirstname().toUpperCase(), user.getLastname().toUpperCase()));
    }

//========================================================================================

    // TODO Capitalize the users username, firstName and lastName
    Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map((user -> new User(user.getUsername().toUpperCase(), user.getFirstname().toUpperCase(), user.getLastname().toUpperCase())));
    }

//========================================================================================

    //// TODO Capitalize the users username, firstName and lastName using #asyncCapitalizeUser
    //Flux<User> asyncCapitalizeMany(Flux<User> flux) {
    //
    //    return flux.flatMap(user -> this.requestProductApi());
    //}
    //
    //Mono<String> requestProductApi() {
    //
    //    return Mono.just("response");
    //}

}
