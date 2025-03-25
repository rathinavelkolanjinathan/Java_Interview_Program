package org.java.CoreJava.JDK8.stream.filter;

import java.util.HashMap;
import java.util.Map;

public class MapFilter {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "kolanji");
        map.put(2, "rathna");
        map.put(3, "kupuswamy");
        map.put(4, "vadivel");
        map.put(5, "murugesan");

        map.entrySet().stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(obj -> System.out.println(obj));

    }
}
