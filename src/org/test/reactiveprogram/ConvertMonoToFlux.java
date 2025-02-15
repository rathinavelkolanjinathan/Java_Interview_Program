package org.java.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ConvertMonoToFlux {

    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Hello");

        Flux<String> st = Flux.from(mono);
        st.subscribe(System.out::println);

    }
}
