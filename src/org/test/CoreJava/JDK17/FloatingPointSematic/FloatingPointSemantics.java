package org.test.CoreJava.JDK17.FloatingPointSematic;

public class FloatingPointSemantics {

    //In Java 17, a new feature called “Restore Always-Strict Floating-Point Semantics”
    // has been introduced. This feature aims to improve the consistency and reliability of floating-point arithmetic in Java applications.
    // It can be mainly important in applications where precision is critical
    //Prior to Java 17, the result of this operation would have been 0.30000000000000004
    //due to rounding errors that can occur in floating-point arithmetic.
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
    }
}
