package org.test.coreJavaprogram.java8.lambdaexpression.TypesofLamdaexpression;

public class BlockedLambda {
    public static void main(String[] args) {
        BlockedLamb obj = () -> System.out.println("hello"); // non blocked lambda
        obj.m1();

        BlockedLamb obj1 = () -> {
            System.out.println("blocked");
        };  // blocked lambda
        obj1.m1();
    }
}
