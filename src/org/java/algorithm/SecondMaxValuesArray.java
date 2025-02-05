package org.java.algorithm;

import java.util.logging.Logger;

public class SecondMaxValuesArray {
    private static final Logger logger = Logger.getLogger(SecondMaxValuesArray.class.toString());

    public static void main(String[] args) {
        int[] inputArray = {5, 900000, 3, 15, 1, 2};
        int result = getSecondMaxValues(inputArray);
        logger.info("Second max values " + result);
    }

    public static int getSecondMaxValues(int inputArray[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                secondMax = max;
                max = inputArray[i];
                //System.out.print(max);
            } else if (inputArray[i] > secondMax && inputArray[i] != max)
                secondMax = inputArray[i];
        }
        return secondMax;
    }
}
