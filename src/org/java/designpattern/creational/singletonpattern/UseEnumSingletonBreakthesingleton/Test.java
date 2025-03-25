package org.java.designpattern.creational.singletonpattern.UseEnumSingletonBreakthesingleton;

public class Test {
    public static void main(String[] args) {
        Singleton si = Singleton.INSTANCE;
        si.perform();
        Singleton sig1 = Singleton.INSTANCE;
        sig1.perform();
        System.out.print("Si"+si);
        System.out.print("Sin"+sig1);
    }
}
