package org.test.CoreJava.JDK8.joinstring;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner(",", "[", "]");
        System.out.println("StringJoinerTest" + join);


    }
}
