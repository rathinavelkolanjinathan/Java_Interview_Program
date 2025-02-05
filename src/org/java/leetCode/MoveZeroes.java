package org.java.leetCode;

import java.util.Arrays;

/**
 * iven an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.

 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {
    public static void moveZeroes(int[] intArray) {
        int n = intArray.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (intArray[j] != 0) {
                intArray[i] = intArray[j];
                i++;
            }
        }
        for (int k = i; k < n; k++) {
            intArray[k] = 0;

        }
        Arrays.stream(intArray)
                .forEach(array-> System.out.println("Array values"+array));

    }

    public static void main(String[] args) {
       int [] intArray = {0,1,0,3,12};
        MoveZeroes.moveZeroes(intArray);
    }
}
