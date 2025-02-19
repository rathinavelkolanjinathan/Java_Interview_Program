package org.test.reactiveprogram;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MonoTest {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        Mono<Integer> mono = Mono.just(121);
        mono.subscribe(list1::add);
        System.out.println(list1);

        //Using jsut
        Mono<String> just = Mono.just("Hello");
        just.subscribe(data -> System.out.println("just" + data));
        // using publisher interface
        Publisher<String> publisher = Mono.just("Hello");
        //justOrEmpty(
        Mono<String> justEmpty = Mono.justOrEmpty(null);
        //from supplier interface

        String st = "kolanji";
        Mono<String> supplier = Mono.fromSupplier(() -> st);

        System.out.println("UsingSupplier:: " + supplier.subscribe().toString());

        //from callable

        Mono<String> callable = Mono.fromCallable(() -> "Hello");

        System.out.println("callable:: " + callable);

        //Feature

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");

        Mono<String> complete = Mono.fromFuture(completableFuture);

        System.out.println("feature:: " + complete);
    }
}
