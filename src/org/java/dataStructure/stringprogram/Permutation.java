package org.java.dataStructure.stringprogram;

import java.util.Arrays;

/**
 * Given two strings ,write a method to decide if one is permutation of the other
 * <p>
 * Input:  god ,dog
 */
public class Permutation {
    public static void main(String args[]) {

        /* * A method exposed to client to calculate permutation of String in Java. */
        boolean result = permutation("god", "dog");
        System.out.println(result);

    }

    private static boolean permutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str1));
    }

    static String sort(String str) {
        char content[] = str.toCharArray();
        Arrays.sort(content);
        return new String(content);


    }

}