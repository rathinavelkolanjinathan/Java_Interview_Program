package org.test.CoreJava.java8.stream;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"rf", "velmurugan", "ney", "kolllllllll"};
        String longestString = Arrays.stream(arr)
                .reduce((word1, word2) ->
                        word1.length() >
                                word2.length() ? word1 : word2).get();
        System.out.println("Longest String is.... " + longestString);
    }
}
