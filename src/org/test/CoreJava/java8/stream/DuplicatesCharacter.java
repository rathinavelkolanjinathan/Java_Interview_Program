package org.test.CoreJava.java8.stream;

import org.test.common.Database;
import org.test.common.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesCharacter {
    public static void main(String[] args) {

        String str = "kooolllaanjii";
        /* All Duplicate Element */
       /* List<String> results = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate Values " + results);

        *//* All Unique Element *//*

      //List<String> unique =  Arrays.asList(str.split("")).stream().distinct().collect(Collectors.toList());
        List<String> uniqueElement = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Unique Values  " + uniqueElement);
*/

        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println("Duplicate Character...."+k + ":" + v);
            }
            /*if (v == 1) {
                System.out.println("Without Duplicate....."+k + ":  " + v);
            }*/
        });

        //Duplicate string remove
        String ss = "hello how are are you you you";
        // Remove duplicates while maintaining order
        String duplicateRemove = Arrays.stream(ss.split(" "))
                .collect(Collectors.toCollection(LinkedHashSet::new)) // Preserve order
                .stream()
                .collect(Collectors.joining(" ")); // Combine words back into a single string

        System.out.println("After duplicate removed....."+duplicateRemove);

        Map<Integer, Long> idCounts= Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));
        System.out.println("Customised class duplicate ....."+idCounts);

        //only duplicate employee id will print
        Set<Integer> seen = new HashSet<>();
        Set<Employee> duplicates = Database.getEmployeeDetails().stream()
                .filter(e -> !seen.add(e.getId()))
                // If `add` returns false, it's a duplicate
                .collect(Collectors.toSet());

        System.out.println("Duplicate Employees: " + duplicates);

        //scenario2

        // Group by id and find duplicates
        Map<Integer, Long> idCounts1 = Database.getEmployeeDetails().stream()
                .collect(Collectors.groupingBy(Employee::getId, Collectors.counting()));

        // Filter duplicates and print them
        Database.getEmployeeDetails().stream()
                .filter(e -> idCounts1.get(e.getId()) > 1) // Keep only duplicates
                .distinct() // Avoid repeating the duplicate entries in output
                .forEach(System.out::println); // Print duplicates

        int[] str1 = {11,11,12,13,14,15};
    }
}
