package org.java.CoreJava.JDK8.lambdaexpression;

public class SummableFunc {
    public static void main(String[] args) {
        Summable sumType = (a, b) -> a + b;
        int result = sumType.sum(5, 6);
        System.out.println("result=" + result);
    }
}
