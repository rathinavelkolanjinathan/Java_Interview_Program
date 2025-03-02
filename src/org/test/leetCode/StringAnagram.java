package org.test.leetCode;

import java.util.Arrays;

/**
 *
 * String anagram
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class StringAnagram {
    public static boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s", "");
        String s2 = t.replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            return false;
        } else {

            char[] array1 = s1.toLowerCase().toCharArray();
            char[] array2 = s2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean status = Arrays.equals(array1, array2);
            if (status) {
                return true;
            } else {

                return false;
            }
        }
    }
    public static void main(String[] args) {
        String  s = "anagram", t = "nagaram";
        StringAnagram.isAnagram(s,t);
    }
}

