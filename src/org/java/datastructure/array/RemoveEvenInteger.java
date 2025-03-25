package org.java.datastructure.array;

import java.util.Arrays;
import java.util.logging.Logger;

public class RemoveEvenInteger {
    private static final Logger logger = Logger.getLogger(RemoveEvenInteger.class.toString());

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int[] evenNumber = removeEvenNumber(array);
        printArray(evenNumber);
    }

    public static int[] removeEvenNumber(int[] evenArray) {
        int oddcount = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 != 0) {
                oddcount++;
            }
        }
        int[] result = new int[oddcount];  //based on the event number we are creating the array
        int idx = 0;
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 != 0) {
                result[idx] = evenArray[i];
                idx++;
            }
        }
        return result;
    }

    public static void printArray(int[] result) {
        Arrays.stream(result)
                .forEach(eventInt -> logger.info("Remove EvenInteger" + eventInt));

    }
}
