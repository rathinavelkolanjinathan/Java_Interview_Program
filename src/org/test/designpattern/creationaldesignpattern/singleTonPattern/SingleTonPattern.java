package org.java.designpattern.creationaldesignpattern.singleTonPattern;

public class SingleTonPattern {
    private static SingleTonPattern INSTANCE = null;

    private SingleTonPattern() {
    }

    public static SingleTonPattern getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized (SingleTonPattern.class) {
                if (INSTANCE == null) {
                    synchronized (SingleTonPattern.class) {
                        Thread.sleep(2000);
                    }
                }
                INSTANCE = new SingleTonPattern();
            }
        }
        return INSTANCE;
    }
}
