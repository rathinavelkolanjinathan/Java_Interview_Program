package org.test.CoreJava.JDK8.predicate;

import java.util.function.Predicate;

public class CheckForNull implements Predicate {

    @Override
    public boolean test(Object o) {
        return o != null;
    }

    public static void main(String[] args) {
        Predicate predicate = (value) -> value != null;

        System.out.println("Values " + predicate);
    }
}
