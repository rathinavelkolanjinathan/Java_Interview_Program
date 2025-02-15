package org.java.dataStructure.arrayprogram;

import java.util.logging.Logger;

public class NearestValue {
    private static final Logger logger = Logger.getLogger(NearestValue.class.toString());

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 7, 8, 8, 9};
        logger.info("" + findClosest(arr, 5));
        logger.info("" + findClosest(arr, 11));
        logger.info("" + findClosest(arr, 4));
    }

    public static int findClosest(int[] arr, int target) {
        int idx = 0;
        int dist = Math.abs(arr[0] - target);

        for (int i = 1; i < arr.length; i++) {
            int cdist = Math.abs(arr[i] - target);

            if (cdist < dist) {
                idx = i;
                dist = cdist;
            }
        }

        return arr[idx];
    }
}
