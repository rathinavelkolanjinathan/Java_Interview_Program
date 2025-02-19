package org.test.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;

/**
 * concat() and concatWith()
 * merge() and mergeWith()
 * mergeSequential()
 * zip() and zipWith()
 */
public class CombineMonoWithFlux {
    public static void main(String[] args) {
//Concat
        Flux<String> firstFlux = Flux.fromArray(new String[]{"Kolanji", "nathan"});
        Flux<String> secondFlux = Flux.fromArray(new String[]{"Kolanji", "nathan"});
        Flux<String> combinedFlux = Flux.concat(firstFlux, secondFlux);
        combinedFlux.subscribe(data -> System.out.println(data));

        // Concat With


        Flux<String> flux = Flux.fromArray(new String[]{"a", "b", "c"});
        Mono<String> mono = Mono.just("f");

        // combine Flux and Mono
        Flux<String> combinedFlux1 = flux.concatWith(mono);

        // subscribe and print the elements of a combined Flux
        combinedFlux1.subscribe(element -> System.out.print(element + " "));

        // Using Merge
        StepVerifier.create(returnedMerge())
                .expectNext("a")
                .expectNext("c")
                .expectNext("b")
                .expectNext("d")
                .expectComplete()
                .verify();
        //Using Merge with
        StepVerifier.create(returnMergedWith())
                .expectNext("a")
                .expectNext("c")
                .expectNext("b")
                .expectNext("d")
                .expectComplete()
                .verify();
        //Using Sequetial
        StepVerifier.create(mergeSequentialTest())
                .expectNext("a")
                .expectNext("b")
                .expectNext("c")
                .expectNext("d")
                .expectComplete()
                .verify();

        //Using Zip Method
        System.out.println();
        Flux<String> flux1 = Flux.just("A", "B", "C");
        Flux<String> flux2 = Flux.just("D", "E", "F");

        Flux.zip(flux1, flux2, (first, second) -> first + second).subscribe(System.out::println);

        //flxWith
        Flux<Integer> flux11 = Flux.just(1, 2, 3);
        Flux<Integer> flux22 = Flux.just(4, 5, 6);

        flux11.zipWith(flux22, (firstNum, secondNum) -> firstNum * secondNum).subscribe(System.out::println);


    }

    public static Flux<String> returnedMerge() {

        Flux<String> firstFlux = Flux.fromArray(new String[]{"a", "b"})
                .delayElements(Duration.ofMillis(100));
        Flux<String> secondFlux = Flux.fromArray(new String[]{"c", "d"})
                .delayElements(Duration.ofMillis(125));

        return Flux.merge(firstFlux, secondFlux);
    }

    private static Flux<String> returnMergedWith() {

        Flux<String> firstFlux = Flux.fromArray(new String[]{"a", "b"})
                .delayElements(Duration.ofMillis(100));
        Flux<String> secondFlux = Flux.fromArray(new String[]{"c", "d"})
                .delayElements(Duration.ofMillis(125));

        return firstFlux.mergeWith(secondFlux);
    }

    private static Flux<String> mergeSequentialTest() {

        Flux<String> firstFlux = Flux.fromArray(new String[]{"a", "b"})
                .delayElements(Duration.ofMillis(100));
        Flux<String> secondFlux = Flux.fromArray(new String[]{"c", "d"})
                .delayElements(Duration.ofMillis(125));

        return Flux.mergeSequential(firstFlux, secondFlux);
    }
}
