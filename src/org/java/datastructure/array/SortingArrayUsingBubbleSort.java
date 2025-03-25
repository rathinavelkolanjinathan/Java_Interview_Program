package org.java.datastructure.array;

/**
 * Sorting array using bubble sort
 */
public class SortingArrayUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //Second largest element
        int secondLargest = arr[arr.length - 3];
        System.out.println("Second Largest..... " + secondLargest);

    }
}