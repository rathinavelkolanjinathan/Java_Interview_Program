package org.java.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;

public class LogForFlux {
    public static void main(String[] args) {

        Flux<String> cities = Flux.fromIterable(new ArrayList<>(Arrays.asList("New York", "London", "Paris", "Toronto", "Rome")));
        cities.log().subscribe();

        // Error Recived From

        Mono<String> error = Mono.fromSupplier(() -> {
            // let's throw an error here so that we can receive the onError signal from this Mono
            throw new RuntimeException("Mono failed to send the data!");
        });

        error.log().subscribe(
                data -> System.out.println("Data received from the Mono: " + data), // onNext
                err -> System.out.println("Error received with message: " + err),  // onError
                () -> System.out.println("Completed!") // onComplete
        );
    }
}
