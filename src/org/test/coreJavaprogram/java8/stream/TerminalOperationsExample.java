package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Terminal Operations are the type of Operations that return the result.
// These Operations are not processed further just return a final result value.

/**
 * 1.collect()
 * 2.forEach()
 * 3.reduce()
 * 4.count()
 * 5.findFirst()
 * 6.allMatch()
 * 7.anyMatch()
 * Note: Intermediate Operations are running based on the concept of Lazy Evaluation,
 * which ensures that every method returns a
 * fixed value(Terminal operation) before moving to the next method.
 */
//
public class TerminalOperationsExample {
    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        System.out.println("forEach:");
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("\ncollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(
                "",
                (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.trim());

        // count: Count the number of names
        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(
                name -> name.startsWith("S")
        );
        System.out.println("\nallMatch (all start with 'S'):");
        System.out.println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(
                name -> name.startsWith("S")
        );
        System.out.println("\nanyMatch (any start with 'S'):");
        System.out.println(anyStartWithS);
    }
}
