package org.java.dataStructure.arrayprogram;

import java.util.Arrays;
public class SecondLargestArrayElement {
    public static void main(String[] args) {
        Integer array[] = {100, 300, 200, 600, 400, 700, 500, 8000, 900};
        int arrayLength = array.length;
        Arrays.sort(array);
        //System.out.println(Arrays.toString(arr));
        int secondLargest = array[arrayLength - 2];
        System.out.println("secondLargest:: " + secondLargest);
    }
}
