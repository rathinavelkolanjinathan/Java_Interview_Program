package org.test.dataStructure.array;

import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        Integer array[] = {100, 300, 200, 600, 400, 700, 500, 8000, 900};
        int length = array.length;
        Arrays.sort(array);
        //System.out.println(Arrays.toString(arr));
        int secondLargest = array[length - 2];
        System.out.println("Second Largest.... " + secondLargest);
    }
}
