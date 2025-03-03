package org.test.designpattern.creationaldesignpattern;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {
        // Private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
