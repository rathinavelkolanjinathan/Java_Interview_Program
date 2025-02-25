package org.test.coreJavaprogram.java8.foreachloops;

import java.util.ArrayList;
import java.util.List;

public class StreamForLoopreturn {
    static String second(List<String> list)
    {
        list
                .stream()
                .forEach(
                        s -> {
                            // The next line will throw error
                            // as no return allowed

                            // if(s=="For")return s;

                        });
        return "null";
    }

    public static void main(String[] args)
            throws Exception
    {

        List<String> arr1 = new ArrayList<String>();
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");
        String f = second(arr1);
        System.out.println(f);
    }
}
