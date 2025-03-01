package org.test.coreJavaprogram.java8.lamdaexpression.TypesofLamdaexpression;


/**
 * Types of lambda expression
 * 1.Parametrized lambda.
 * 2.Non Parametrized lambda
 * 3.Non void lambda expression
 * 4.Void lambda expression
 */
public class TypesLambda {
    public static void main(String[] args) {

        I i = () -> {
            System.out.println("void Type Test");
        };
        i.m1();

        J j = (int x) -> {
            System.out.println("Void with param" + x);
        };
        j.m2(10);

        K k = () -> {
            return 234;
        };
        k.m3();

        L l = (x) -> {
            return x * x;
        };

        int ii = l.m4(10);
        System.out.println("Void with param" + ii);
    }

}
