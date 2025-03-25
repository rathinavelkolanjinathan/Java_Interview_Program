package org.java.datastructure.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class LeftRotation {
    private static final Logger logger = Logger.getLogger(LeftRotation.class.toString());

    static int[] rotateLeft(int[] array, int d) {
        int arrLength = array.length;
        int[] rotArray = new int[arrLength];
        for (int oldIndex = 0; oldIndex < arrLength; oldIndex++) {
            int newIndex = (oldIndex + arrLength - d) % arrLength;
            rotArray[newIndex] = array[oldIndex];
        }
        return rotArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int input = sc.nextInt();
        int[] arrSize = new int[arraySize];
        for (int i = 0; i < arrSize.length; i++) {
            arrSize[i] = sc.nextInt();
        }
        int[] res = rotateLeft(arrSize, input);
        String rotateResult = Arrays.toString(res);
        logger.info("Left Rotation" + rotateResult);
        sc.close();
    }
}
