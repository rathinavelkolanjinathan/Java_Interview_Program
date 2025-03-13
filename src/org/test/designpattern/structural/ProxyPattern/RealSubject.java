package org.test.designpattern.structural.ProxyDesignPattern;

public class RealSubject  implements Subject {

    @Override
    public void method() {
        System.out.print("Am actual Implements");
    }
}
