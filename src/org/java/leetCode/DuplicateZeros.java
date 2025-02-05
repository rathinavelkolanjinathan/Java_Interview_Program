package org.java.leetCode;

import java.util.Arrays;

/**
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * <p>
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {

        // We need to have memo to keep all integers that should be inserted
        int[] memo = new int[arr.length];
        boolean duplicate = false;
        int read = 0;
        int write = 0;
        for (int i = 0; i < arr.length; i++) {
            if (duplicate) {
                memo[write++] = arr[i];
                arr[i] = 0;
            } else if (read != write) {
                memo[write++] = arr[i];
                arr[i] = memo[read++];
            }

            if (arr[i] == 0) {
                duplicate = !duplicate;
            }
        }
        Arrays.stream(memo)
                .forEach(a -> System.out.println("index>>" + a));

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        DuplicateZeros.duplicateZeros(arr);
    }
}
