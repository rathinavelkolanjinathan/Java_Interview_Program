package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("1","2","3");
        String ss = String.join("-",list);
        System.out.println(ss);

    }
}
