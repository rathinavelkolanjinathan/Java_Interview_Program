package org.test.designpattern.creationaldesignpattern;

public class Threadsafesingleton {
    private Threadsafesingleton() {
        // Private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        private static final Threadsafesingleton INSTANCE = new Threadsafesingleton();
    }

    public static Threadsafesingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
