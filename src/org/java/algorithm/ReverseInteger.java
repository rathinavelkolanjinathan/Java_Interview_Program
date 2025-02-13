package org.java.algorithm;

/**
 * Leetcode problem
 */
public class ReverseInteger {
    public static int reverse(int number) {
        int res = 0;
        while (number != 0) {
            int temp = number % 10;
            res = res * 10 + temp;
            number = (number - temp) / 10;
            if (res % 10 != temp) //exceed int range
            {
                return 0;
            }
        }
        return res;
    }

    public static void main(String arg[]) {

        int result = reverse(123);
    }
}
