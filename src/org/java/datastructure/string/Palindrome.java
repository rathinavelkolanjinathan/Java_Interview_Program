package org.java.datastructure.string;

public class Palindrome {

    public static void main(String[] args) {
        String str = "202";
        String result = palindrome(str);
        if (str.equals(result)) {
            System.out.println(str + " is a Palindrome....." + result);
        } else {
            System.out.println(str + " is not a Palindrome...." + result);
        }
    }

    public static String palindrome(String str) {
        String reverse = "";
        int length = str.length();
        if (str == null || str.isEmpty()) {
            return str;
        }
        for (int i = length - 1; i >= 0; i--) {
            //System.out.println("reverse: " + reverse);
            reverse = reverse + str.charAt(i);

        }
        return reverse;
    }

}
