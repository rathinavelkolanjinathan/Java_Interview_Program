package org.java.CoreJava;

public class StringEquals {
    public static void main(String[] args) {
        // Using the Integer class as an example
        Integer num1 = new Integer(100);
        Integer num2 = new Integer(100);

        // Using '=='
        System.out.println("Using '==': " + (num1 == num2)); // false, compares references

        // Using 'equals()'
        System.out.println("Using 'equals()': " + num1.equals(num2)); // true, compares values

        // Example with stringDemo
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using '=='
        System.out.println("Using '==': " + (str1 == str2)); // false, compares references

        // Using 'equals()'
        System.out.println("Using 'equals()': " + str1.equals(str2)); // true, compares values
    }
}
