package org.java.reactiveprogram;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Stream;

public class FluxFromJdk8 {
    static Logger logger = LoggerFactory.getLogger(FluxFromJdk8.class);
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(Arrays.asList("1,2,3,3,"));

        Stream<String> streamList = list.stream();
        Flux<String> flux = Flux.fromStream(streamList);
        logger.info("Hello");


    }
}
