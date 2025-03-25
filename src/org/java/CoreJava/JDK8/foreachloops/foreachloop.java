package org.java.CoreJava.JDK8.foreachloops;

public class foreachloop {
    public static void main(String[] args)
    {
        String[] arr = { "1", "2", "3" };
        int count = 0;

        String[] arr1 = { "Geeks", "For", "Geeks" };

        for (String str : arr) {
            System.out.print(arr1[count++]);
        }
    }
}
