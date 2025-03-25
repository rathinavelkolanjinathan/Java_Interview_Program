package org.java.CoreJava.JDK8.joinstring;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("1","2","3");
        String join = String.join("-",list);
        System.out.println("StringJoin"+join);

    }
}
