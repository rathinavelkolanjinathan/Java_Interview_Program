package org.java.dataStructure.stringprogram;

public class StringPalindrome {

    public static void main(String[] args) {
        String inputStr = "202";
        String result = reverse(inputStr);
        if (inputStr.equals(result)) {
            System.out.println("Yes "+inputStr+" is a Palindrome  : " + result);
        } else {
            System.out.println("NO "+inputStr + " is not a palindrome  : " + result);
        }
    }

    public static String reverse(String source) {
        String reverse = "";
        int length = source.length();
        if (source == null || source.isEmpty()) {
            return source;
        }
        for (int i = length - 1; i >= 0; i--) {
            //System.out.println("reverse: " + reverse);
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }

}
