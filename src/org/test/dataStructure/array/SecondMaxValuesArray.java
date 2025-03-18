package org.test.dataStructure.array;

import java.util.logging.Logger;

public class SecondMaxValuesArray {
    private static final Logger logger = Logger.getLogger(SecondMaxValuesArray.class.toString());

    public static void main(String[] args) {
        int[] arr = {5, 900000, 3, 15, 1, 2};
        int result = getSecondMaxValues(arr);
        logger.info("Second max values " + result);
    }

    public static int getSecondMaxValues(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
                //System.out.print(max);
            }
            else if (arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }
        return secondMax;
    }
}
