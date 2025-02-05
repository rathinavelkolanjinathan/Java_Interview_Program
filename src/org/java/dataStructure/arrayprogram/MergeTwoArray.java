package org.java.dataStructure.arrayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArray {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e"));

        listOne.addAll(listTwo);  //Merge both lists

        // listOne.sort(listOne);

        //System.out.println(listOne);
        //System.out.println(listTwo);

        //jdk 8
        ArrayList<String> listOne1 = new ArrayList<>(Arrays.asList("a", "b", "c"));

        ArrayList<String> listTwo2 = new ArrayList<>(Arrays.asList("c", "d", "e"));

        List<String> combinedList = Stream.of(listOne1, listTwo2)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println("Merged Array" + combinedList);
    }
}
