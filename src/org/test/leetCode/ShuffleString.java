package org.test.leetCode;
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
           // System.out.println("Result shuffling>>"+indices[i] +s.charAt(i));
            //System.out.println("Result >>"+s.charAt(i));
            result[indices[i]] = s.charAt(i);
        System.out.println("Result Shuffling....."+result.toString());
        return new String(result);
    }
    public static void main(String[] args) {
        // stringDemo st = "abc", int [] indices = [0,1,2]
        String st = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String result = ShuffleString.restoreString(st, indices);
        System.out.println("Result Shuffling...." + result);
    }
}
