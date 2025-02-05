package org.java.leetCode;

import java.util.Arrays;

/**
 * Given an Array of integers, return an Array where every element
 * at an even-indexed position is squared.
 * <p>
 * Input: array = [9, -2, -9, 11, 56, -12, -3]
 * Output: [81, -2, 81, 11, 3136, -12, 9]
 * Explanation: The numbers at even indexes (0, 2, 4, 6) have been squared,
 * whereas the numbers at odd indexes (1, 3, 5) have been left the same.
 */
public class ArrayEvenIndexSquare {
    public static int[] squareEven(int[] array, int length) {
        // Check for edge cases.
        if (array == null) {
            return array;
        }

        // Iterate through even elements of the original array.
        // Notice how we don't need to do *anything* for the odd indexes? :-)
        for (int i = 0; i < length; i += 2) {
            System.out.println("position"+i);
            // Index is an even number, so we need to square the element
            // and replace the original value in the Array.
            array[i] *= array[i];

        }

        // We just return the original array. Some problems on leetcode require you
        // to return it, and other's don`t.
        return array;

    }

    public static void main(String[] args) {
        int[] array = {9, -2, -9, 11, 56, -12, -3};
        int length = array.length;
        int[] result =ArrayEvenIndexSquare.squareEven(array, length);
        Arrays.stream(result).forEach(a -> System.out.println(a));
    }
}
