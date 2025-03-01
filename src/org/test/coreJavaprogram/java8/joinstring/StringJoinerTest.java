package org.test.coreJavaprogram.java8.joinstring;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner(",", "[", "]");
        System.out.println("St" + join);


    }
}
