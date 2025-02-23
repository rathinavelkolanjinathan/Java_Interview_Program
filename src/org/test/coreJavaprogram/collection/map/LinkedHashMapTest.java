package org.test.coreJavaprogram.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        //Iteration order is changed
        Map<String,String> map = new HashMap<>();
        map.put("name","Kolanji");
        map.put("address","rathna");
        map.put("wel","vel");
        map.put("age","aelu");
        map.put("weigh","nat");
         System.out.print("");
        for(Map.Entry<String,String> value:map.entrySet()){
           // System.out.println("map value >>>>  "+value);
            System.out.println("Key: " + value);
        }
        System.out.print("\n");
// Sorted natural order based on the key
        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("name","Kolanji");
        treeMap.put("Address","Addition");
        treeMap.put("when","celmurugan");
        for(Map.Entry<String,String> value:treeMap.entrySet()){
            System.out.println("Tree Map >>>  "+value);

        }
        System.out.print("\n");

        // Insertion order will maintain
        Map<String,String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name","Kolanji");
        linkedHashMap.put("address","rathna");
        linkedHashMap.put("wel","vel");
        linkedHashMap.put("age","aelu");
        linkedHashMap.put("weigh","nat");

        for(Object value:linkedHashMap.entrySet()){
            System.out.println("linkedHashMap >>>  "+value);

        }
        System.out.print("\n");
    }
}
