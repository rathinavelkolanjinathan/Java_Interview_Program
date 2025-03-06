package org.test.reactiveprogram;

import reactor.core.publisher.Flux;

public class FluxRange {
    public static void main(String[] args) {

        // create a Flux that will contains values 1...15
        Flux<Integer> flux1 = Flux.range(1, 15);

        flux1.subscribe(data -> System.out.println("Flx1 Values...." + data));
        System.out.println();
        // create a Flux that will contains values 5...29
        Flux<Integer> flux2 = Flux.range(5, 25);
        flux2.subscribe(data -> System.out.println("Flx2 Values.... " + data));
    }
}
