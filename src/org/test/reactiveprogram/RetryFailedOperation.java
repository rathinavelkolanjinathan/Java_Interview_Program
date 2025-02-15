package org.java.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

public class RetryFailedOperation {
    public static void main(String[] args) {
        //Using retry
        Mono.just("data1")
                .concatWith(Flux.error(new RuntimeException("Exception occurred.")))
                .doOnError(ex -> System.out.println("LOG: Exception caught: " + ex))
                .retry(3) //retry 3 times in case of an error
                .log()
                .subscribe();

        //Using retryWhen
        Mono.just("data1")
                .concatWith(Flux
                        .error(new RuntimeException("Exception")))
                .retryWhen(Retry
                        .fixedDelay(3, Duration.ofSeconds(2)))
                .log()
                .subscribe();

        // Using back Off
        Mono.just("data")
                .concatWith(Flux.error(new RuntimeException("ExceptionOccured")))
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2))).log().subscribe();

        //retry specific execption Only Like InternalServerError

        //Mono.just("data").concatWith(Flux.error(new RuntimeException("ExceptionOccured")))
        //.retryWhen(Retry.backoff(3,Duration.ofSeconds(2))).filter(throwable ->throwable instanceof InternalServerError ).log().subscribe();
    }
}
