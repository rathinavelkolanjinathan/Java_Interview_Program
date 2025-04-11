package org.java.CoreJava.JDK8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        //empty  - return empty values
        //of -> when your object is never null the go to use for Of
        //ofNullable -> Pbject is may or may not nullable then go to OfNullable

       // Customer customer = new Customer(101, "john", null, Arrays.asList("3214"));
        //   Optional<Object> o = Optional.empty();
        //  System.out.print("values of "+o);

        // Optional<stringDemo> p = Optional.ofNullable(customer.getEmail());
        //System.out.println("of nullable "+p.get());

        //Optional<stringDemo> op = Optional.of(customer.getEmail());
        //System.out.println("optional"+op);

        Customer customer = new Customer(101, "john", "kolanjirathna@gmail.com", Arrays.asList("3214"));
        Optional<String> optional = (customer.getEmail());
        if (optional.isPresent()) {  //It returns a boolean (true if a value is present, otherwise false).
            System.out.println("isPresent.... " + optional.get());
        }

        optional.ifPresent(value -> System.out.println("Value: " + value)); //If a value is present, invoke the specified Consumer with the value

        System.out.println("orElse.... " + optional.orElse("default message "));
        //System.out.println("values " + prsent.orElseThrow(() -> new IllegalArgumentException("email is not found")));

        System.out.println("Map....." + optional.map(String::toUpperCase).orElseGet(() -> "defult values "));


    }
}
