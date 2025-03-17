package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounting {
    public static void main(String[] args) {
        //String based character counting
        String str = "Koollaaaaaaaaaaaaaaaannjji";
        Map<String, Long> map = Arrays.asList(str.split(""))
                .stream()
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + "=" + value));


        //Array based character counting
        String[] st = {"Balaji", "Pankaj", "RAM"};

        Map<Character, Long> characterCount = String.join("", st)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("CharacterCount..."+characterCount);

    }
}
