package org.test.coreJavaprogram.java8.lamdaexpression;

public interface ThisFunction_Test {

    public abstract int m1();
}

class Student {
    int a = 90;
}

class Employee extends Student {
    int a = 222;

    public int test() {

        int a = 333;
        ThisFunction_Test i = () -> {
            //System.out.println("hello");
            return a;
        };

        int ii = i.m1();
        return ii;

    }

}