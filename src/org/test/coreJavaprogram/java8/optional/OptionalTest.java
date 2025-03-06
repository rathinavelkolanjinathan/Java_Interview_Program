package org.test.coreJavaprogram.java8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        //empty  - return empty values
        //of -> when your object is never null the go to use for Of
        //ofNullable -> Pbject is may or may not nullable then go to OfNullable

        Customer customer = new Customer(101, "john", null, Arrays.asList("3214"));
        //   Optional<Object> o = Optional.empty();
        //  System.out.print("values of "+o);

        // Optional<String> p = Optional.ofNullable(customer.getEmail());
        //System.out.println("of nullable "+p.get());

        //Optional<String> op = Optional.of(customer.getEmail());
        //System.out.println("optional"+op);

        Customer cust = new Customer(101, "john", "kolanjirathna@gmail.com", Arrays.asList("3214"));
        Optional<String> prsent = (customer.getEmail());
        if (prsent.isPresent()) {
            System.out.println("isPresent.... " + prsent.get());
        }
        System.out.println("orElse.... " + prsent.orElse("default message "));
        //System.out.println("values " + prsent.orElseThrow(() -> new IllegalArgumentException("email is not found")));

        System.out.println("Map....." + prsent.map(String::toUpperCase).orElseGet(() -> "defult values "));


    }
}
