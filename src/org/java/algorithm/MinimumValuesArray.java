package org.java.algorithm;

import java.util.logging.Logger;

public class MinimumValuesArray {
    private static final Logger logger = Logger.getLogger(MinimumValuesArray.class.toString());

    public static void main(String[] args) {
        int[] minimumArray = {5, 9, 3, 15, 1, 2};
        int minimumValues = getMinimumValueArray(minimumArray);
        logger.info("Minimum Values " + minimumValues);
    }

    public static int getMinimumValueArray(int[] array) {

        if (array == null || array.length == 0) {

            throw new IllegalArgumentException("Exception");
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {   // this is find the miminumn logic
                min = array[i]; // when is minimu values is occured then only come inside
               // logger.info("loop" + min);
            }
        }
        return min;
    }
}
