package org.test.coreJavaprogram.java8.fucntionalinterface;

@FunctionalInterface
public interface I {
    abstract void m1();

    default void m2() {
        System.out.println("Method-2");
    }

    default void m3() {
        System.out.println("Method-3");
    }

    static void m4() {
        System.out.println("Method-4");
    }

    static void m5() {
        System.out.println("Method-5");
    }
}
