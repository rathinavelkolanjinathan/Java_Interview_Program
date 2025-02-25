package org.test.coreJavaprogram.java8.Reduce;

import java.util.stream.Stream;

public class SuOfResult {
    public static void main(String[] args) {
        Integer sumResult = Stream.of(2, 3, 4, 5, 6, 7).reduce(0, (a, b) -> a + b);
        System.out.println("Result" + sumResult);
    }
}
