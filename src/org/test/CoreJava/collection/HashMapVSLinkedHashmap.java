package org.test.CoreJava.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVSLinkedHashmap {
    public static void main(String[] args) {

        //Map :order is not maintained
        Map<String,String> map = new HashMap();

        map.put("Key1","kolanji");
        map.put("Film","veera");
        map.put("addres","12 56");
        //map.put(null,"hello"); // not allowed
        map.put("hai",null);
        map.put(null,null);

        map.forEach((key,value)->System.out.println(key+"=="+value));

        System.out.println("---------------------------------- Linked Hashmap start");
        Map<String,String> map1 = new LinkedHashMap();
        map1.put("Key1","kolanji");
        map1.put("Film","veera");
        map1.put("addres","12 56");
        //map.put(null,"hello"); // not allowed
        map1.put("hai",null);
        map1.put(null,null);
        map1.put(null,null);
        map1.forEach((key,value)->System.out.println(key+"=="+value));
    }
}
