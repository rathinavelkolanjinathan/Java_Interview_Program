package org.test.coreJavaprogram.java8.fucntionalinterface;

public class FunctionInheritanceMain {

    public static void main(String[] args) {

        FunctionInheritance2 fun = new FunctionInheritance2() {

            @Override
            public void m1() {

                System.out.println("Hello values ");
            }
        };
        fun.m1();

    }

}
