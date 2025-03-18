package org.test.CoreJava.enumDemo;

import org.test.concurrencyapi.Declare;

public class CompareEnum {
    public static void main(String[] args) {
        Declare d = Declare.EAST;

        Declare d1 = Declare.valueOf("EAST");
        System.out.println(d == d1);
    }

}
