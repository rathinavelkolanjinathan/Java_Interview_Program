package org.java.datastructure.string;

public class CompareStringWithoutStringClass {
    // This method compares two strings
    // lexicographically without using
    // library functions
    public static int stringCompare(String str1, String str2) {

        int inputStr1 = str1.length();
        int inputStr2 = str2.length();
        int strMinimum = Math.min(inputStr1, inputStr2);

        for (int i = 0; i < strMinimum; i++) {
            int str1_ch = str1.charAt(i);
            int str2_ch = str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        // Edge case for strings like
        // stringDemo 1="Geeks" and stringDemo 2="Geeksforgeeks"
        if (inputStr1 != inputStr2) {
            return inputStr1 - inputStr2;
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }

    // Driver function to java the above program
    public static void main(String args[]) {
        String string1 = new String("Geeksforgeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");

        // Comparing for stringDemo 1 < stringDemo 2
        System.out.println("Comparing " + string1 + " and " + string2 + " : " + stringCompare(string1, string2));

        // Comparing for stringDemo 3 = stringDemo 4
        System.out.println("Comparing " + string3 + " and " + string4 + " : " + stringCompare(string3, string4));

        // Comparing for stringDemo 1 > stringDemo 4
        System.out.println("Comparing " + string1 + " and " + string4 + " : " + stringCompare(string1, string4));
    }
}
