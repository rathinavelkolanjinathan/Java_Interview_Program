package org.test.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DoOnCallback {
    public static void main(String[] args) {
        Flux.just("data1", "data2", "data3")
                .doOnSubscribe(subscription -> System.out.println("Subscription: " + subscription))
                .subscribe();

        //doOnNext
        Flux.just("data1", "data2", "data3")
                .doOnNext(data -> System.out.println("Data: " + data))
                .subscribe();

        //doOnComplete

        Flux.just("data1", "data2", "data3")
                .doOnNext(data -> System.out.println("Data: " + data))
                .doOnComplete(() -> System.out.println("Publisher sent Completion signal!"))
                .subscribe();
    }

    //DO ON ERROR
    Mono mono = Mono.fromSupplier(() -> {
        throw new RuntimeException(" an error occurred!"); // invoking the onError signal from the Publisher (Mono)
    });

    //mono.doOnError(err -> System.out.println("Error: " + err)).subscribe();

    //doFinally
    // successful scenario
    // Mono.just("data")
    //    .doFinally(signal -> System.out.println(signal + " signal received."))
    //   .subscribe();

    // failed scenario
    Mono mono1 = Mono.fromSupplier(() -> {
        throw new RuntimeException(" an error occurred!"); // invoking the onError signal from the Publisher (Mono)
    });

    // mono1.doFinally(signal -> System.out.println(signal + " signal received.")).subscribe();
}
