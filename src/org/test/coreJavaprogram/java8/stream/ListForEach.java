package org.java.coreJavaprogram.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {

    public static void main(String[] args) {
        List<String> listVal = new ArrayList<>();
        listVal.add("kolanji");
        listVal.add("rathna");
        listVal.add("murugesan");
        listVal.add("vadivel");
        listVal.add("amuthavalli");
        listVal.add("kala");
        listVal.add("kuppuswamy");

        listVal.stream().forEach(emp -> System.out.println(emp));


    }

}
