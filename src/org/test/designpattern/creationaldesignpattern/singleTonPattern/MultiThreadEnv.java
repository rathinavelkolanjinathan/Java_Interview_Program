package org.test.designpattern.creationaldesignpattern.singleTonPattern;

public class MultiThreadEnv {
    private static volatile MultiThreadEnv multiThreadEnv;

    private MultiThreadEnv() {

    }

    public static MultiThreadEnv getInstance() {

        synchronized (MultiThreadEnv.class) {
            if (multiThreadEnv == null) {
                multiThreadEnv = new MultiThreadEnv();
            }
        }

        return multiThreadEnv;
    }

}
