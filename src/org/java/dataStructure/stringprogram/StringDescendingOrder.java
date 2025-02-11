package org.java.dataStructure.stringprogram;

import java.util.Arrays;
import java.util.Comparator;

public class StringDescendingOrder {
    public static void main(String[] args) {
        String[] ss = {"4", "8", "5", "7", "9", "1"};
        Arrays.stream(ss)
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s));//descending
    }
}
