package org.java.dataStructure.arrayprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class TwoSumProblem {
    private static final Logger logger = Logger.getLogger(TwoSumProblem.class.toString());

    public static void main(String[] args) {
        //target =9;

        int number[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = twoSum(number, 9);

        logger.info("result " + result[0] + "re::" + result[1]);
    }

    public static int[] twoSum(int[] arr, int target) {

        int[] result = new int[4];
        Map map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                //System.out.println("array " + arr[i]);
                map.put(arr[i], i);
                logger.info("map " + map);
            } else {
                result[1] = i;
                result[0] = (Integer) map.get(target - arr[i]);
                logger.info(" else map " + map);
                return result;
            }
        }
        return result;
    }
}
