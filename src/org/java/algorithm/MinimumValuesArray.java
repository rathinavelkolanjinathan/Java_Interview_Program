package org.java.algorithm;

import java.util.logging.Logger;

public class MinimumValuesArray {
    private static final Logger logger = Logger.getLogger(MinimumValuesArray.class.toString());
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 15, 1, 2,0};
        int minimumValues = getMinimumValueArray(array);
        logger.info("Minimum Values " + minimumValues);
    }

    public static int getMinimumValueArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Exception");
        }
        int minValue = array[0];
        System.out.println("Min"+minValue);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {   // this is find the minimum logic
                minValue = array[i]; // when is minimum values is occurred then only come inside
                // logger.info("loop" + min);
            }
        }
        return minValue;
    }
}
