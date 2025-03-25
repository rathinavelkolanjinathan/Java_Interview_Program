package org.java.CoreJava.JDK8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class used to counting the character from the given input stringDemo.
 *
 */
public class CountingOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String strVal = "abcaadcbcb";

        //methods1
        Map<String, Long> charCount =
                Arrays.asList(strVal.split(""))
                        .stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //methods2
        Map<String, Long> charCount1 =
                Arrays.stream(strVal.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Counting ::" + charCount1);

        /* Counting occurrence of Integer values */
        int value = 21122556;

        Map<String, Long> integerCount =
                Arrays.stream(String.valueOf(value).split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Integer Count {}" + integerCount);

    }
}
