package org.test.designpattern.creationaldesignpattern;

public class EagerSingletonImplementation {
    private static final EagerSingletonImplementation instance = new EagerSingletonImplementation();

    private EagerSingletonImplementation() {
        // private constructor to prevent instantiation
    }

    public static EagerSingletonImplementation getInstance() {
        return instance;
    }
}
