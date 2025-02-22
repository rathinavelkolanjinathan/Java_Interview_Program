package org.test.coreJavaprogram.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListAndSort {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));

        List<String> combinedList = Stream.of(listOne, listTwo)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
         //List<String> result = combinedList.stream().sorted(Comparator.reverseOrder());

        System.out.println("Sorted values " + combinedList);
    }
}
