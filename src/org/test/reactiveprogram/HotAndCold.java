package org.test.reactiveprogram;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

public class HotAndCold {
    public static void main(String[] args) throws InterruptedException {
        Flux<String> st = Flux.fromStream(HotAndCold::getVideo)
                .delayElements(Duration.ofSeconds(2));
        // First Subscriber
        st.subscribe(data -> System.out.println("Data part" + data));
        // wait 5 seconds before next Subscriber joins
        Thread.sleep(5000);
        // Seconds Subscriber
        st.subscribe(data -> System.out.println("Data part" + data));

        Thread.sleep(60000);

        //HOT PUblish

        Flux<String> hotPublish = Flux.fromStream(HotAndCold::getVideo)
                .delayElements(Duration.ofSeconds(2)).share();
        //refCount()
        Flux<String> netFlux = Flux.fromStream(HotAndCold::getVideo)
                .delayElements(Duration.ofSeconds(2))
                .publish()
                .refCount(2); // minSubscribers
// Using cache method
        Flux<String> catchFlux = Flux.fromStream(HotAndCold::getVideo)
                .delayElements(Duration.ofSeconds(2))
                .cache();


    }

    private static Stream<String> getVideo() {
        System.out.println("Request for the video streaming received.");
        return Stream.of("part 1", "part 2", "part 3", "part 4", "part 5");
    }
}
