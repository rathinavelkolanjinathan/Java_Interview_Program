package org.java.common;

import java.util.Arrays;

public class PrintArrayValues {
    public static void printArray(int[] result) {
        Arrays.stream(result).forEach(values -> System.out.println(values));

    }
}
