package org.test.coreJavaprogram.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// rotate the left and right
public class RotationCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){

            list.add(i);
        }

        Collections.rotate(list,3);   // right rotate
        System.out.println(list);
        Collections.rotate(list,-4);  // left rotate
        System.out.println(list);
    }
}
