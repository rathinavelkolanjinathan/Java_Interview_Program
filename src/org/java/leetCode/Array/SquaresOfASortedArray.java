package org.java.leetCode.Array;

import java.util.Arrays;

/**
 * Working fine
 */

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int length = intArray.length;
        int[] sqArray = new int[length];

        for (int i = 0; i < length; i++) {
            sqArray[i] = intArray[i] * intArray[i];
        }
        Arrays.sort(sqArray);
        return sqArray;
    }

    public static void main(String[] args) {
        int[] intArray = {-4, -1, 0, 3, 10};
        int[] result = SquaresOfASortedArray.sortedSquares(intArray);
        Arrays.stream(result)
                .forEach(aa -> System.out.println("Square of...."+aa));
    }
}
