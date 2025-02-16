package org.test.coreJavaprogram.java8.peekdemo;

import java.util.Arrays;
import java.util.List;

public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> intlist = Arrays.asList(1, 2, 3, 4);
        System.out.println(intlist.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a + a)
                .peek(System.out::println)
                .filter(b -> b > 5).count());
    }
}
