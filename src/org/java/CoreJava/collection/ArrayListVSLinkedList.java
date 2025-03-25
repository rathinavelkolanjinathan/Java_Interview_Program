package org.java.CoreJava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kolanji");
        list.add("priya");
        list.add("rathna");
        list.add("rathna");
        list.add("rathna");
        list.add(null);
        list.add(null);
        list.add(null);

        Iterator it = list.iterator();
        while(it.hasNext()){

            Object obj = it.next();
            System.out.println("------------------------- List "+list);
        }
        //System.out.print("------------------------- List "+list);

        List linkedList = new LinkedList();
        linkedList.add("Kolanji");
        linkedList.add("priya");
        linkedList.add("rathna");
        linkedList.add("rathna");
        linkedList.add("rathna");
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        System.out.print("------------------------- LinkedList "+linkedList);
    }
}
