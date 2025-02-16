package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesCharacter {
    public static void main(String[] args) {

        String duplicate = "kooolllaanjii";
        /* All Duplicate Element */
        List<String> results = Arrays.stream(duplicate.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate Values " + results);

        /* All Unique Element */
        List<String> uniqueElement = Arrays.stream(duplicate.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Unique Values  " + uniqueElement);

    }
}
