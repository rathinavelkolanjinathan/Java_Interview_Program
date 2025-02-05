package org.java.coreJavaprogram.java8.fucntionalinterface;

public class FucntionalLaunch implements FunctionalInterfaceTest {

    @Override
    public void m1() {
        System.out.println("display parent import ");

    }

    public static void main(String[] args) {

        FunctionalInterfaceTest obj = new FucntionalLaunch();
        obj.m1();
        obj.m2();
        //m4();  static method call
        //m4(); static method

        // Just testing lambda expression

        FunctionalInterfaceTest obj1 = () -> System.out.println("Gahe");
        obj1.m2();
    }

}
