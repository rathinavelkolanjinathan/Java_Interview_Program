package org.test.coreJavaprogram.java8.mapreduce;

import org.test.common.Database;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
// old method
        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println("Old method>> " + sum);

        //using stream
        int sum1 = numbers.stream()
                .mapToInt(i -> i).sum();
        System.out.println("Sum1>>" + sum1);
        //using reduce

        Integer reduceSum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("ReduceSum>> " + reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("Reduce Sum With Method Reference>>" + reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Mul Result>>" + mulResult);

        //find the max values using reduce
        Integer maxvalue = numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Maxvalue>>" + maxvalue);
        //find the max values
        Integer maxvalueWithMethodReference = numbers.stream()
                .reduce(Integer::max)
                .get();
        System.out.println("Max Value With Method Reference>>" + maxvalueWithMethodReference);

        // find the longest string
        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ?
                        word1 : word2)
                .get();
        System.out.println("Longest String>>" + longestString);

        //get employee whose grade A
        //get salary
        double avgSalary = Database.getEmployeeDetails()
                .stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        System.out.println("Avg Salary>>" + avgSalary);

        //sum of salary for a grade employee
        double sumSalary = Database.getEmployeeDetails().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Sum Salary>>" + sumSalary);
    }


}
