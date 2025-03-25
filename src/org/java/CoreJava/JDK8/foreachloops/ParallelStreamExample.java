package org.java.CoreJava.JDK8.foreachloops;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args)
            throws Exception {

        List<String> arr1
                = new ArrayList<String>();
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");

        System.out.println("list" + arr1);
        arr1.parallelStream().forEach(
                        s -> {
                            System.out.print("parallel stream :" + s);
                        });
    }
}
