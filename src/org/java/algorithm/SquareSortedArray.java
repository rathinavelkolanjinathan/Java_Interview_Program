package org.java.algorithm;

import java.util.Arrays;
import java.util.logging.Logger;

public class SquareSortedArray {
    private static final Logger logger = Logger.getLogger(SquareSortedArray.class.toString());

    public static int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sq[i] = nums[i] + 1 * nums[i] + 1;
        }
        Arrays.sort(sq);
        return sq;
    }

    public static void main(String[] args) {
        int[] num = {-4, -1, 0, 3, 10};
        SquareSortedArray.sortedSquares(num);
        logger.info("num" + num);
    }
}


