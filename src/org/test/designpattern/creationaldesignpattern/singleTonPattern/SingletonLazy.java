package org.test.designpattern.creationaldesignpattern.singleTonPattern;


//instance created when is first requested saving momory until the object is actually needed
public class SingletonLazy {
    private static SingletonLazy INSTANCE = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() throws InterruptedException {
        if (INSTANCE == null) {

            INSTANCE = new SingletonLazy();

        }
        return INSTANCE;
    }

}
