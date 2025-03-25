package org.java.leetCode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;  // 32" to ignore the letter case
            }
            if (!(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
                continue;
            } else {
                str.append(ch);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    public static void main(String[] args) {
        String inputString = "A man, a plan, a canal... Panama";
        //stringDemo s = "race a car"
        //s = " "
        boolean result = ValidPalindrome.isPalindrome(inputString);
        System.out.println(inputString+" is a valid Palindrome is...."+result);
    }
}
