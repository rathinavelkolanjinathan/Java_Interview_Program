package org.java.CoreJava;

public class SplitSingleDigitTechieQuestion {
    public static void main(String[] args) {
        int number = 123456; // Original number
        System.out.println("Original number: " + number);

        // Calculate the sum of digits until it's a single-digit
        while (number >= 10) {
            number = sumOfDigits(number);
        }

        System.out.println("Single-digit result: " + number);
    }

    // Helper method to calculate the sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Extract the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}
