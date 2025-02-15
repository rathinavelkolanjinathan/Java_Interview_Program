package org.java.concurrencyapi;

import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Retrieving a value from the map
        Integer value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Checking if a key exists
        boolean containsKey = map.containsKey("Cherry");
        System.out.println("Contains key 'Cherry': " + containsKey);

        // Iterating over the map
        map.forEach((key, val) -> {
            System.out.println("Key: " + key + ", Value: " + val);
        });

        // Removing a key-value pair
        map.remove("Apple");
        System.out.println("After removing 'Apple': " + map);
    }
}
