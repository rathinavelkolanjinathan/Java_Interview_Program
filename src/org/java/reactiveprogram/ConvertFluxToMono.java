package org.java.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ConvertFluxToMono {
    public static void main(String[] args) {

        Flux<Integer> flux = Flux.just(12);
        Mono<Integer> mono = flux.next();
        // get data from mono
        mono.subscribe(data -> System.out.println("Data From Flux to Mono: " + data));

        // multiple values
        Flux<String> flux2 = Flux.just("Data2", "Data3", "Data4");

        Mono<String> monoFromFlux2 = flux2.next();

        // get data from mono
        monoFromFlux2.subscribe(data -> System.out.println("Data From Flux to Mono :" + data));
    }
}
