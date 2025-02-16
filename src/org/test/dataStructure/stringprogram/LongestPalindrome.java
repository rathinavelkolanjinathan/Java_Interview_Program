package org.test.dataStructure.stringprogram;

import java.util.logging.Logger;

public class LongestPalindrome {
    private static final Logger logger = Logger.getLogger(LongestPalindrome.class.toString());
    int resultStart;
    int resultLength;

    public String longestPalindrome(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return str;
        }
        for (int i = 0; i < strLength - 1; i++) {
            expandRange(str, i, i);
            expandRange(str, i, i + 1);
        }
        return str.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        String str = "babad";
        // Input: s = "cbbd";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String result = longestPalindrome.longestPalindrome(str);
        logger.info("Longest Palindrome::" + result);
    }
}
