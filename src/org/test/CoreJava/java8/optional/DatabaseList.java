package org.test.CoreJava.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatabaseList {

    public static List<Customer> getAll() {

        return Stream.of(new Customer(101, "john", "john@gmail.com",
                        Arrays.asList("3214")),
                        new Customer(102, "john", "kolanjirathna@gmail.com", Arrays.asList("3215")))
                .collect(Collectors.toList());
    }


}
