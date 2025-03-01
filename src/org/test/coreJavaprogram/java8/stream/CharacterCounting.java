package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounting {
    public static void main(String[] args) {
        String str = "Koollaaaaaaaaaaaaaaaannjji";
        Map<String, Long> countChar = Arrays.asList(str.split(""))
                .stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countChar.forEach((key, value) -> System.out.println(key + "=" + value));


    }
}
