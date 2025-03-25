package org.java.CoreJava.technicalquestions;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int [][]array ={{1,2,3},{2,4,6},{4,4,6}};

        int row = array.length;
        int cloumn = array[0].length;

        System.out.println("row.... "+row);
        System.out.println("cloumn.... "+cloumn);

        //Manually copy the array element


        //Copy the array element
        Arrays.copyOf(array,array.length);
    }
}
