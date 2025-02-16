package org.test.coreJavaprogram.java8.stream;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "kolanji");
        map.put(2, "rathna");
        map.put(3, "kupuswamy");
        map.put(4, "vadivel");
        map.put(5, "murugesan");

        //Method 1 lambda
        map.forEach((key, value) ->
                System.out.println(" key {} :: " + key + " values {}::" + value));

        //Method 2 using stream
        map.entrySet()
                .stream()
                .forEach(m -> System.out.println("map values {} :: " + m));

    }


}
