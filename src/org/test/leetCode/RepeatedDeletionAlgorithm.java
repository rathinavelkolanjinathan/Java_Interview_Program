package org.java.leetCode;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates such that each element appears only once.
 * <p>
 * Input: array = [1, 1, 2]
 * Output: [1, 2]
 * Input: array = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 * Output: [0, 1, 2, 3, 4]
 * <p>
 * pace complexity of
 * <p>
 * (1)
 * O(1) and a time complexity of
 * <p>
 * <p>
 * O(N).
 */
public class RepeatedDeletionAlgorithm {

    public static int[] removeDuplicates(int[] nums) {
        // Check for edge cases.
        if (nums == null || nums.length == 0) {
            return nums;
        }

        // Count how many unique elements are in the Array.
        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            // An element should be counted as unique if it's the first
            // element in the Array, or is different to the one before it.
             System.out.println(nums[i - 1]);
            if (i == 0 || nums[i] != nums[i - 1]) {
                //System.out.println(nums[i - 1]);
                uniqueNumbers++;
            }
        }

        // Create a result Array.
        int[] result = new int[uniqueNumbers];

        // Write the unique elements into the result Array.
        int positionInResult = 0;
        for (int i = 0; i < nums.length; i++) {
            // Same condition as in the previous loop. Except this time, we can write
            // each unique number into the result Array instead of just counting them.
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[positionInResult] = nums[i];
                positionInResult++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] result = removeDuplicates(array);
        Arrays.stream(result).forEach(aa -> System.out.println(aa));
    }
}
