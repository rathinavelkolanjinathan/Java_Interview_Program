package org.test.reactiveprogram;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class BackPressure {
    public static void main(String[] args) {
        Flux<Integer> publisher = Flux.range(1, 100).log();

        publisher.subscribe(new BaseSubscriber() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(5); // request only 5 elements
            }
        });


        publisher.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(5);
            }

            @Override
            protected void hookOnNext(Integer value) {
                if (value == 5) { // we know that the last element is 5
                    cancel();
                }
            }
        });
    }
}
