package org.test.coreJavaprogram.java8.lambdaexpression;

public class SummableFunc {
    public static void main(String[] args) {
        Summable sumType = (a, b) -> a + b;
        int result = sumType.sum(5, 6);
        System.out.println("result=" + result);
    }
}
