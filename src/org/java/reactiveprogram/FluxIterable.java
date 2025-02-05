package org.java.reactiveprogram;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;

public class FluxIterable {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(Arrays.asList("12,12,13,14"));
        Flux<String> st = Flux.fromIterable(list);
    }
}
