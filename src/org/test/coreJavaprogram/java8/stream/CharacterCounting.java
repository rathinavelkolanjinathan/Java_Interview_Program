package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounting {
    public static void main(String[] args) {
        String str = "Koollaaaaaaaaaaaaaaaannjji";
        Map<String, Long> map = Arrays.asList(str.split(""))
                .stream()
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + "=" + value));


    }
}
