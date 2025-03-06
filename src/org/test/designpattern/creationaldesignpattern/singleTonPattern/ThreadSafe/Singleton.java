package org.test.designpattern.creationaldesignpattern.singleTonPattern.ThreadSafe;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    synchronized (Singleton.class) {
                        if (INSTANCE == null) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                System.out.println("Exception" + ex.getMessage());
                            }
                            INSTANCE = new Singleton();
                        }
                    }
                }
            }
        }
        return INSTANCE;
    }
}
