package org.java.coreJavaprogram.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> sup = () -> {
            return "hi";
        };

        List<String> list = Arrays.asList("a", "b");

        System.out.println(list.stream().findAny().orElseGet(sup));
    }
}
