package org.test.coreJavaprogram.java8.fucntionalinterface;

public interface A {
    default void display() {

        System.out.println("Super Interface");

        if (this instanceof B) {
            ((B) this).display2();

        }
    }
}
