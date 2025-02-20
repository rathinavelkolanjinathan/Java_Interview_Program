package org.test.coreJavaprogram.java8.fucntionalinterface;

public interface DefaultInterfaceA {
    default void display() {

        System.out.println("Super Interface");

        if (this instanceof DefaultInterfaceB) {
            ((DefaultInterfaceB) this).display2();

        }
    }
}
