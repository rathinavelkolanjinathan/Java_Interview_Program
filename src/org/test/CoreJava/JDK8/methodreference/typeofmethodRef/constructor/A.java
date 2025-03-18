package org.test.CoreJava.JDK8.methodreference.typeofmethodRef.constructor;

public class A {
    public void test() {
        System.out.println("This is implementation m-i");
    }

    public static void main(String[] args) {
        I obj = new A()::test;
        obj.m1();
    }
}
