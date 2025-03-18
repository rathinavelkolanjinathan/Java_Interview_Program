package org.test.designpattern.creational.singletonpattern;

//instance is created at the time of class loading .it is simple but does not offer lazy loading
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        // private constructor to prevent instantiation
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
