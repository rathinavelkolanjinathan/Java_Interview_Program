package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharacters {
    public static void main(String[] args) {
        String st = "Koollaaaaaaaaaaaaaaaannjji";
        String[] aa = st.split("");
        //System.out.println(aa.toString());
        Map<String, Long> map = Arrays.stream(aa)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
