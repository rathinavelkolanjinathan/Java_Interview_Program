package org.test.coreJavaprogram.java8.fucntionalinterface.inheritance;

public class FunctionInheritanceMain {

    public static void main(String[] args) {

        I fun = new I() {

            @Override
            public void m1() {

                System.out.println("Hello values ");
            }
        };
        fun.m1();

    }

}
