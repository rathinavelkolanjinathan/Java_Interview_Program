package org.test.coreJavaprogram.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapVSTreeMap {
    public static void main(String[] args) {
        Map<String,String> map1 = new LinkedHashMap<>();
        map1.put("Key1","kolanji");
        map1.put("Film","veera");
        map1.put("addres","12 56");
        //map.put(null,"hello"); // not allowed
        map1.put("hai",null);
        map1.put(null,null);
        map1.forEach((key,value)->System.out.println(key+"=="+value));

        System.out.println("-----------------Tree Map------------------- ");

        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("name","kolanji");
        treeMap.put("adress","veera");
        treeMap.put("balance","1256");
        //map.put(null,"hello"); // not allowed
        //treeMap.put("hai",null);
       // treeMap.put(null,null);
        treeMap.forEach((key,value)->System.out.println(key+"=="+value));
    }
}
