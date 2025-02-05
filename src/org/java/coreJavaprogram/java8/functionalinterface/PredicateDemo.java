package org.java.coreJavaprogram.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> pre = t -> t % 2 == 0;
        List<Integer> list = Arrays.asList(2, 3);
        list.stream().filter(pre).forEach(t -> System.out.print(t));
    }
}
