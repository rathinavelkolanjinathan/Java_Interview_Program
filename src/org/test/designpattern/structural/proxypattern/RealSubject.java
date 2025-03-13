package org.test.designpattern.structural.proxypattern;

public class RealSubject  implements Subject {

    @Override
    public void method() {
        System.out.print("Am actual Implements");
    }
}
