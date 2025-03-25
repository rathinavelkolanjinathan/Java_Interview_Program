package org.java.CoreJava.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetTrickyQuestions {
    enum Name {alice, smith, bob, lanes}

    public static void main(String[] args) {
        Set<Name> set = new TreeSet<>();
        set.add(Name.alice);
        set.add(Name.smith);
        for (Name name : set) {

            System.out.println("Set Values ........ " + name);
        }
    }
}
