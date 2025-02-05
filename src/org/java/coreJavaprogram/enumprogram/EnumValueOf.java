package org.java.coreJavaprogram.enumprogram;

import org.java.concurrencyapi.Declare;

public class EnumValueOf {

    public static void main(String[] args) {
        Declare[] d=Declare.values();
       // Declare[] d=Declare.valueOf("EAST");

        for(Declare dd:d)
        System.out.print("enum values "+dd);
    }
}
