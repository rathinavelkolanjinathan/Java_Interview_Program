package org.test.coreJavaprogram.java8.joinstring;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner(",", "[", "]");
        System.out.println("StringJoinerTest" + join);


    }
}
