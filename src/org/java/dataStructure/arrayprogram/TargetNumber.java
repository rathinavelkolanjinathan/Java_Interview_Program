package org.java.dataStructure.arrayprogram;

import java.util.HashSet;
import java.util.Set;

public class TargetNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printPairs(arr, 7);
    }

    public static void printPairs(int[] arrays, int pairNumber) {
        if (arrays.length < 2) {
            return;
        }
        Set set = new HashSet(arrays.length);
        for (int value : arrays) {
            int target = pairNumber - value;

            // if target number is not in set then add
            if (!set.contains(target)) {
                set.add(value);
            } else {

                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
}
