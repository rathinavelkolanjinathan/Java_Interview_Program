package org.test.reactiveprogram;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class ReactorExecutionModel {
    public static void main(String[] args) {
        Flux<String> cities = Flux.just("New York", "London", "Paris", "Amsterdam")
                .map(String::toUpperCase)
                .filter(cityName -> cityName.length() <= 8)
                .map(cityName -> cityName.concat(" City"))
                .log();

        cities.subscribe();

        //SubscribeOn
        Flux<String> citi = Flux.just("New York", "London", "Paris", "Amsterdam")
                .subscribeOn(Schedulers.boundedElastic())
                .map(String::toUpperCase)
                .filter(cityName -> cityName.length() <= 5)
                .map(cityName -> cityName.concat(" City"))
                .log();

        citi.subscribe();

    }
}
