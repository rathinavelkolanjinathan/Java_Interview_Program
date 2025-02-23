package org.test.coreJavaprogram.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FinalList {

    public static void main(String[] args) {

        final List<String> list = new ArrayList<>();
//parent parent=new Child();//runtime polymophisim

        list.add("a");
        list.add("b");

        System.out.println(list);

        Map<String, String> map = new TreeMap<>();
        map.put("a", "xyz");
        map.put("d", "ksh");
        map.put("b", "lvjdf");
        System.out.println(map);


    }
}
