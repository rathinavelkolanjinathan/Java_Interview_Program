package org.test.designpattern.creational.singletonpattern.UseEnumSingletonBreakthesingleton;


// Enum is thread safe only so single ton class is return the same hashcode only.
public class EnumIsThreadSafe {
    public static void main(String[] args) {
        Runnable runnable =()->{
            Singleton singleton =Singleton.INSTANCE;
            singleton.perform();
        };
        Thread t1 = new Thread(runnable,"th");
        Thread t2 = new Thread(runnable,"th");
        t1.start();;
        t2.start();

    }
}
