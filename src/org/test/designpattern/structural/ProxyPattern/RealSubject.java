package org.test.designpattern.structural.ProxyPattern;

public class RealSubject  implements Subject {

    @Override
    public void method() {
        System.out.print("Am actual Implements");
    }
}
