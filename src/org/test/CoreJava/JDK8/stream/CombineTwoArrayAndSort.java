package org.test.CoreJava.JDK8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class CombineTwoArrayAndSort {

    public static void main(String[] args) {
        //stringDemo array
        String[] array1 = {"1", "3", "4", "4"};
        String[] array2 = {"2", "5", "5"};

        /* Combine two different arrays and sort */
        String[] mergedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray(String[]::new);
        System.out.println("Merged Two Array with Sorting" + Arrays.toString(mergedArray));

        /*
         Two different arrays and sorted and distinct
         */
        String[] mergedDistinct = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .distinct()
                .toArray(String[]::new);
        System.out.println("Merged with distinct" + Arrays.toString(mergedDistinct));

        /*
        Integer array sorting
        */

        Integer[] arrOne = {1, 3, 40};
        Integer[] arrTwo = {44, 6, 6, 7, 3, 407};

        Integer[] arraySorted = Stream.of(arrOne, arrTwo)
                .flatMap(Stream::of)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println("Merged Integer" + Arrays.toString(arraySorted));

        /*
         Distinct value for Integer array
         */
        Integer[] distinct = Stream.of(arrOne, arrTwo)
                .flatMap(Stream::of)
                .sorted()
                .distinct()
                .toArray(Integer[]::new);
        System.out.println("Merged with distinct values " + Arrays.toString(distinct));
    }


}