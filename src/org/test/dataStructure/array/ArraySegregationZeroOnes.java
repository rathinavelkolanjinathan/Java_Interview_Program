package org.test.datastructure.array;

public class ArraySegregationZeroOnes {
    static void getSegregate(int[] arr, int length) {
        int count = 0; // counts the no of zeros in arr
        for (int i = 0; i <length; i++) {
            if (arr[i] == 0)
                //System.out.println("Values "+arr[i]);
                count++;
        }
        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;
        // System.out.println("Count values " + n);
        // loop fills remaining arr space with 1
        for (int i = count; i < length; i++)
            arr[i] = 1;
    }

    // driver function
    public static void main(String[] args) {
        int [] array = {0, 1, 0, 1, 1, 1};
        int length = array.length;
        getSegregate(array, length);
        print(array, length);
    }

    // function to print segregated array
    static void print(int [] array, int length) {
        System.out.print("After Array Segregation Is.... ");
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
    }
}
