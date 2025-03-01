package org.test.coreJavaprogram.java8.defaultInterface.overloadandoverride;

public interface I {
    abstract void m1();

    default void m2(int x) {

        System.out.println("Method-1" + x);
    }

    default void m3() {

        System.out.println("Method-3");
    }
}
