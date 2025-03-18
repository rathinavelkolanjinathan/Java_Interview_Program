package org.test.datastructure.array;

import java.util.Arrays;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        String[] array = {"{30,40}\n{70,80}\n{50,60}"};

        String concatenate = "";
        for (int i = 0; i < array.length; i++) {
            concatenate += array[i].replace("{", "")
                    .replace("}", "") + ",";

        }
        String[] splitNumbers = concatenate.split(",");
        int[] numbers1 = new int[splitNumbers.length];
        for (int i = 0; i < splitNumbers.length; i++) {
            numbers1[i] = Integer.parseInt(splitNumbers[i]);

        }

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        //Jdk8

        // Remove special characters and split into individual numbers
        int[] numbers = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.replaceAll("[{}]", "").split(",")))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));


    }
}
