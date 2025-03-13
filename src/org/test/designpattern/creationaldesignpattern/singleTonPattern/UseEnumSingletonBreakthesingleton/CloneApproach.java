package org.test.designpattern.creationaldesignpattern.singleTonPattern.UseEnumSingletonBreakthesingleton;
// We are getting same hashcode here so there is no possible to break the
// singleton class using the serializable
public class CloneApproach {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        //singleton.clone();
    }
}
