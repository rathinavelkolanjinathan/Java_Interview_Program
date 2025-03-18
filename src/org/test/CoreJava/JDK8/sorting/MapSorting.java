package org.test.CoreJava.JDK8.sorting;

import java.util.*;
import java.util.Map.Entry;

public class MapSorting {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("two", 2);
        map.put("Three", 3);
        map.put("one", 1);

        List<Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
        //Collections.sort(entry, (emp1, emp2) -> (emp1.getKey().compareTo(emp2.getKey())));
        System.out.println("List" + map);

        //BasedBy Key
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        //Based by values
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
