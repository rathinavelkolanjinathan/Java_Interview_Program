package org.test.leetCode;
/**
 * Not Working
 */
public class ShuffledString {
    public static String restoreString(String s, int[] indices) {
        String output = "";
        for (int j = 0; j < indices.length; j++) {
            for (int i = 0; i < s.length(); i++) {
                output = "" + s;
            }
        }
        System.out.print("Output......" + output);
        return output;
    }

    public static void main(String[] args) {
        String input = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(input,indices);
    }
}
