package org.test.CoreJava.JDK8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListAndSort {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("b", "a", "d", "e", "d"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("j", "w", "z", "y", "i"));


        List<String> combinedList = Stream.of(listOne, listTwo)
                .flatMap(x -> x.stream())
                .sorted()
                .collect(Collectors.toList());
        // second options
        // List<String> result = combinedList.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted values " + combinedList);
    }
}
