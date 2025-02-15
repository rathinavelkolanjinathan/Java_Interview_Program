package org.java.dataStructure.arrayprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberArray {
    // private static final Logger logger =
    // LoggerFactory.getLogger(DuplicateNumber.class);
    public static void main(String args[]) {
        int[][] array = new int[][]{{1, 1, 2, 2, 3, 4, 5}, {1, 1, 1, 1, 1, 1, 1}, {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};
        for (int[] arr : array) {
            //System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After Removing Duplicate   : " +
                    Arrays.toString(removeDuplicates(arr)));
        }
    }

    public static int[] removeDuplicates(int[] array) {
        // Sorting array to bring duplicates together
        Arrays.sort(array);
        int[] result = new int[array.length];
        int previous = array[0];
        //System.out.println("previous"+previous);
        result[0] = previous;
        for (int i = 1; i < array.length; i++) {
            int ch = array[i];
            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }


    public static void usingJDK8() {
        // ArrayList with duplicate elements
        ArrayList<Integer> arrayList = new ArrayList<>
                (Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        System.out.println("Array:" + arrayList);

        List<Integer> listWithoutDuplicates =
                arrayList
                        .stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println("With out duplicate:" + listWithoutDuplicates);
    }
}
