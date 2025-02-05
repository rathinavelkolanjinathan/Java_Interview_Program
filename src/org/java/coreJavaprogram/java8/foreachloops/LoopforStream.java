package org.java.coreJavaprogram.java8.foreachloops;

import java.util.ArrayList;
import java.util.List;

public class LoopforStream {
    public static void main(String[] args) throws Exception
    {

        List<String> arr1 = new ArrayList<String>();
        int count = 0;
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");
        arr1.stream().forEach(s -> {

            // this will cause an error
           // count++;

            // print all elements
            System.out.print(s);
        });
    }
}
