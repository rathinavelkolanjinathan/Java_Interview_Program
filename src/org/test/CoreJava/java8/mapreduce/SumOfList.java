package org.test.CoreJava.java8.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfList {

    public static void main(String[] args) {
        //method1
        List<Integer> list = Arrays.asList(3, 2, 5, 40);
        int sum = list.stream().mapToInt(i -> i).sum();

        // System.out.println(sum);

        //method2
        //using reduce add
        int sum1 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum1);


        //method3
        Optional<Integer> sum2 = list.stream().reduce(Integer::sum);

        System.out.println("Sum2..." + sum2);

        Integer multiple = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiple..." + multiple);

        //method 1
        Integer maxvalue = list.stream().reduce(0, (a, b) -> a > b ? a : b);

        System.out.println("Max Value...." + maxvalue);

        //method 2

        Integer max1 = list.stream().reduce(Integer::max).get();
        System.out.println("Max1...." + max1);

    }
}
