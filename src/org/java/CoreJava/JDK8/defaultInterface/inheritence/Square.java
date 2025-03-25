package org.java.CoreJava.JDK8.defaultInterface.inheritence;

public interface Square {

    default void calc(int x) {

        System.out.println("Square-calc");
    }


}
