package org.test.designpattern.creationaldesignpattern.singleTonPattern.UseEnumSingleton;
// We getting same hashcode here so there is not possible to break the singlone class using the serializable
public class CloneApporoch {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        //singleton.clone();
    }
}
