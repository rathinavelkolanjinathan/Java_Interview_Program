package org.java.CoreJava.JDK8;

public class Paytm implements Payment {

    @Override
    public void doTransaction() {
        System.out.println("Paytm transaction");
    }
}
