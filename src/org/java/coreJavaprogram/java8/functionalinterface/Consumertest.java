package org.java.coreJavaprogram.java8.functionalinterface;

//consumer
//predicate
//supplier

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumertest {

    public static void main(String[] args) {

        Consumer<String> con = (t) -> {
            System.out.println(t);
        };
        con.accept("10");

        List<String> list = Arrays.asList("a", "b");

        list.stream().forEach(con);  // this is implemetation oif consumer
    }


}

