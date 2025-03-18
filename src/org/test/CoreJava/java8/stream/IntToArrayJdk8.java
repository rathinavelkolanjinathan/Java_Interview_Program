package org.test.CoreJava.java8.stream;

public class IntToArrayJdk8 {
    public static void main(String[] args) {
        int num = 1234567;
        int[] intArray = Integer.toString(num)
                .chars()
                .map(c -> c - '0').toArray();
        for (int value : intArray)
            System.out.println("Array Values...... " + value);
    }
}
