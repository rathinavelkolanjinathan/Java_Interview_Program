package org.test.reactiveprogram;

import reactor.core.publisher.Flux;

public class ExtractDataFromFlux {
    public static void main(String[] args) {


        Flux<String> flux = Flux.fromArray(new String[]{"data1", "data2", "data3"});

        flux.subscribe(System.out::println);

        //OnNext
        flux.doOnNext(System.out::println)
                .subscribe();
    }
}
