package org.java.datastructure.string;

/**
 * Implement an algorithms stringDemo has all unique characters.
 */
public class IsUnique {
    public static void main(String[] args) {
        boolean result = isUniqueChars("Strring");
        System.out.println("Test values " + result);
    }

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            //System.out.println("values..... "+val);
            if (char_set[val]) {
                return false;   // all ready found the char
            }
            char_set[val] = true;
        }

        return true;
    }
}
