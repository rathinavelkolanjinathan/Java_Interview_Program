package org.test.coreJavaprogram.java8.flatmapVSmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);

        List<Integer> l = list.stream()
                .map((x) -> (x * x)).collect(Collectors.toList());
        //List<Integer> l = st.collect(Collectors.toList());
        System.out.println("List values " + l);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .map((x) -> (x * x))
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum Values " + sum);

        //List words= Arrays.asList("JavaDevJournal","Java");
        List words = Arrays.asList("clone", "aava", "aava", "nathan");
        words.stream()
                .map(s -> ((String) s).split(""))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(words);
    }
}
