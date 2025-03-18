package org.test.CoreJava.java8.defaultInterface.instanceOf;

public interface I {
    default void display() {

        System.out.println("Super Interface");

        if (this instanceof B) {
            ((B) this).display2();

        }
    }
}
