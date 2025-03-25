package org.java.CoreJava.JDK8.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AnyMatchTest {
    public static void main(String[] args) {


        ArrayList<String> l = new ArrayList();
        l.add("Java");
        l.add("Net");

        l.add("Amirtha");

        Stream st = l.stream();
        st.anyMatch((x) -> {
            return x=="java";
        });

        st.allMatch((x) -> {
            return x=="java";
        });

        st.noneMatch((x) -> {
            return x=="java";
        });

    }
}
