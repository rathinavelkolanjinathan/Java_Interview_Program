package org.java.reactiveprogram;

import reactor.core.publisher.Mono;

public class MonoSubsCription {

    public static void main(String[] args) {
        //Using subscription
        Mono<String> mono = Mono.just("Good morning");
        mono.subscribe(data -> System.out.println(data));

        // with three evenets

        Mono<String> events = Mono.just("Heelo ");
        events.subscribe(data -> System.out.println(data),
                err -> System.out.println(err),
                () -> System.out.println("completed")
        );


    }

}
