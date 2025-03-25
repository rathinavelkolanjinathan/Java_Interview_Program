package org.java.designpattern.creational.singletonpattern.UseEnumSingletonBreakthesingleton;

// this class is used for avoid attack using the reflection,clone,serializable
public enum Singleton {
    INSTANCE;

    public void perform() {
        System.out.println("doing same task!" + this.hashCode());
    }
}
