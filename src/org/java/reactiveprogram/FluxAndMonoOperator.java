package org.java.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * map()
 * filter()
 * flatMap()
 */
public class FluxAndMonoOperator {

    public static void main(String[] args) {
        //Using map
        Flux.fromArray(new String[]{"kolanji", "Rathna", "velMurugan", "Naidu"})
                .map(String::toUpperCase)
                .subscribe(System.out::println);

        //Using filter
        Flux.fromArray(new String[]{"kolanji", "Rathna", "velMurugan", "Naidu"})
                .filter(name -> name.length() > 5)
                .subscribe(System.out::println);

        //Using FlatMap
         String[] array={"kolanji", "Rathna", "velMurugan", "Naidu"};
        Flux.fromArray(array)
                .flatMap(FluxAndMonoOperator::getValues)
                .subscribe(System.out::println);
    }

    private static Mono<String> getValues(String name) {

        return Mono.just(name.concat("rrr"));
    }
}
