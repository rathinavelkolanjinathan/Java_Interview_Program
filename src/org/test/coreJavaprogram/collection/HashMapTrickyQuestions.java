package org.test.coreJavaprogram.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTrickyQuestions {
    public static void main(String[] args) {

        //Map :order is not maintained
        Map map = new HashMap();
        map.put("Key1", "kolanji");
        map.put("Film", "veera");
        map.put("addres", "12 56");
        //int mm= map.get("addres");  // compile time issue will come
        map.put("addres", "12 56");

        map.put("hai", null);
        map.put(null, null);

        map.forEach((key, value) -> System.out.println(key + "==" + value));
    }
}