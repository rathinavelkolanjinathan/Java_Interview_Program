package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "Koollaaaaaaaaaaaaaaaannjji";
        String[] temp = str.split("");
        //System.out.println(aa.toString());
        Map<String, Long> map = Arrays.stream(temp)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
