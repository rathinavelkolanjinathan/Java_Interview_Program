package org.test.dataStructure.stringprogram;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static void main(String[] args) {
        String[] array = {"4", "8", "5", "7", "9", "1"};
        Arrays.stream(array)
                .sorted(Comparator.reverseOrder())
                .forEach(arr -> System.out.println(arr));//descending
    }
}
