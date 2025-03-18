package org.test.dataStructure.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static void main(String[] args) {

        // Unique values using flatmap
        List<String> words = Arrays.asList("JavaDevJournal", "Java");
        List<String> unique = words.stream()
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique values....." + unique);
    }


}
