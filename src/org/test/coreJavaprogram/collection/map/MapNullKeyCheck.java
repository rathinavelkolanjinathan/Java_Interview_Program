package org.test.coreJavaprogram.collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapNullKeyCheck {

    public static void main(String[] args) {

        Map<String, String> map = new ConcurrentHashMap<>();
        map.put(null, null);
        System.out.println(map);
    }
}
