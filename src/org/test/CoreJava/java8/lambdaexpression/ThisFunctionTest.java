package org.test.CoreJava.java8.lambdaexpression;

public interface ThisFunctionTest {

    public abstract int m1();
}

class Student {
    int a = 90;
}

class Employee extends Student {
    int a = 222;

    public int test() {

        int a = 333;
        ThisFunctionTest i = () -> {
            //System.out.println("hello");
            return a;
        };

        int ii = i.m1();
        return ii;

    }

}