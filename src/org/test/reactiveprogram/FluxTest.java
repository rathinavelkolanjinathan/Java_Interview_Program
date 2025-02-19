package org.test.reactiveprogram;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class FluxTest {
    public static void main(String[] args) {
        //create empty Flux

        Flux flux = Flux.just();
        //Hold only one values
        Flux one = Flux.just("data");

        Flux<String> fluxStr = Flux.just("kolanji", "priya", "rathna");

        List<Integer> list2 = new ArrayList();
        Flux<Integer> flux1 = Flux.just(12, 13, 15);
        flux1.subscribe(list2::add);
        System.out.println(list2);
    }
}
