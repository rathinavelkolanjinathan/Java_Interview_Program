package org.test.coreJavaprogram.java8.stream.filter;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public static void main(String[] args) {
        List<String> listVal = new ArrayList<>();
        listVal.add("kolanji");
        listVal.add("rathna");
        listVal.add("murugesan");
        listVal.add("muru_vadivel");
        listVal.add("amuthavalli");
        listVal.add("kala");
        listVal.add("kuppuswamy");
// Internally used prdicate method
        listVal.
                stream()
                .filter(values -> values.startsWith("m"))
                .forEach(t -> System.out.println(t));
    }
}
