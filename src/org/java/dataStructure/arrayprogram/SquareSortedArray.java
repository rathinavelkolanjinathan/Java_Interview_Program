package org.java.dataStructure.arrayprogram;

import java.util.Arrays;
import java.util.logging.Logger;

public class SquareSortedArray {
    private static final Logger logger = Logger.getLogger(SquareSortedArray.class.toString());

    public static int[] sortedSquares(int[] array) {
        int[] sq = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sq[i] = array[i] + 1 * array[i] + 1;
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


