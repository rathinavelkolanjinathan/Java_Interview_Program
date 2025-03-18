package org.test.CoreJava.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// find out the commons element
public class DisJoint {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);*/
        Collections.addAll(list,1,2,3,4);

        List<Integer> list1 = new ArrayList<>();
       /* list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);*/


        Collections.addAll(list1,2,3,4,5,6,7);
        //find the commons element
        boolean boo = Collections.disjoint(list, list1);
        if (boo) {
            System.out.println("This is no commons");
        } else {
            System.out.println("This is  commons");
        }
    }
}
