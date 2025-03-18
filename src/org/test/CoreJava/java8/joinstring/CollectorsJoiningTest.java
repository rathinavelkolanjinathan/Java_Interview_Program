package org.test.CoreJava.java8.joinstring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningTest {
    public static void main(String[] args) {

        List<String> values = Arrays.asList("how", "are", "you");
        String join = values.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("CollectorsJoiningTest" + join);
    }
}
