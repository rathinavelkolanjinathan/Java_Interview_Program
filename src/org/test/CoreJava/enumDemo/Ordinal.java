package org.test.CoreJava.enumDemo;

import org.test.concurrencyapi.Declare;

public class Ordinal {

    public static void main(String[] args) {
        int d = Declare.EAST.ordinal();
        System.out.print("enum values " + d);
    }
}
