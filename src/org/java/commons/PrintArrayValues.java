package org.java.commons;

import java.util.Arrays;

public class PrintArrayValues {
    public static void printArray(int[] result) {
        Arrays.stream(result)
                .forEach(value -> System.out.println(value));

    }
}
