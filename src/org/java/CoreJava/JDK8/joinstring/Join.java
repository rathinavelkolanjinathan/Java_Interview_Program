package org.java.CoreJava.JDK8.joinstring;

import java.util.Arrays;
import java.util.List;

public class Join {
    public static void main(String[] args) {
        String join = String.join("-","How","how","are");
        System.out.println("St"+join);

        List<String> values = Arrays.asList("how","are","you");
        String join1 = String.join("$",values);
        System.out.println("St"+join1);
        String ss="ABCD";
       String s= String.join("","#",ss);
       System.out.print(s);
    }
}
