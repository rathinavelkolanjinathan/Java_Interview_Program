package org.java.algorithm;

import java.util.logging.Logger;

public class LongestPalindromicSubstring {
    private static final Logger logger = Logger.getLogger(LongestPalindromicSubstring.class.toString());
    int resultStart;
    int resultLength;

    public String longestPalindrome(String input) {
        int strLength = input.length();
        if (strLength < 2) {
            return input;
        }
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(input, start, start);
            expandRange(input, start, start + 1);
        }
        return input.substring(resultStart, resultStart + resultLength);
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
        String input = "babad";
        // Input: s = "cbbd";
        LongestPalindromicSubstring longestpalindromicsubstring = new LongestPalindromicSubstring();
        String result = longestpalindromicsubstring.longestPalindrome(input);
        logger.info("Longest palindrome" + result);
    }
}
