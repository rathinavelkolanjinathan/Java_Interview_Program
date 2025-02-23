package org.test.coreJavaprogram.collection.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
// FailFatList
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            list.add("c");
        }

    }
}
