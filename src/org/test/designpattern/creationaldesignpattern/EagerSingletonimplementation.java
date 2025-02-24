package org.test.designpattern.creationaldesignpattern;

public class EagerSingletonimplementation {
    private static final EagerSingletonimplementation instance = new EagerSingletonimplementation();

    private EagerSingletonimplementation() {
        // private constructor to prevent instantiation
    }

    public static EagerSingletonimplementation getInstance() {
        return instance;
    }
}
