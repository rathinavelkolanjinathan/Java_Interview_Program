package org.test.reactiveprogram;

import reactor.core.publisher.Mono;

public class MonoException {

    public static void main(String[] args) {
        // throw error

        Mono<String> monoexeception = Mono.fromSupplier(() -> {
            throw new RuntimeException("Hello Exception");
        });

        monoexeception.subscribe(data -> System.out.println("data" + data),
                err -> System.out.println("error " + err),
                () -> System.out.println("completed")
        );
    }
}
