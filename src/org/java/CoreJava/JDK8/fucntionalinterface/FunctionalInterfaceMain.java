package org.java.CoreJava.JDK8.fucntionalinterface;

public class FunctionalInterfaceMain implements I {

    @Override
    public void m1() {
        System.out.println("display parent import ");

    }

    public static void main(String[] args) {
        I obj = new FunctionalInterfaceMain();
        obj.m1(); //Default method call
        obj.m2(); //Default method call
        I.m4();  //static method call
        I.m4();  //static method

// so if we want to call the default interface method we should use the implementation class
        // for static method no need the implementation class objects
    }

}
