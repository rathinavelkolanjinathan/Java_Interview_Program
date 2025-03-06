package org.test.dataStructure.arrayprogram;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 4, 2, 5, 9, 8, 7};
        getReverse(originalArray);   //Using algorithm
        //getReverseJdk8(originalArray);
    }

    //old method algorithm o(n)
    public static void getReverse(int[] array) {
       /* for(int i= array.length-1;i>=0;i--){

            System.out.println(array[i]);
        }*/
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            System.out.println(other);
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        for (int arr : array) {
            System.out.println("After Reverse Array....." + arr);
        }
    }
    //using jdk8
    public static void getReverseJdk8(int[] array) {
        int[] reversedArray = Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the reversed array
        System.out.print("Reversed Array jdk8...... ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }



}
