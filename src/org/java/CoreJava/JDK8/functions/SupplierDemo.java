package org.java.CoreJava.JDK8.functions;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

    public static void main(String[] args) {
//No input but out put is avilable

        List<String> list1 = Arrays.asList();

        System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers"));
    }
}
