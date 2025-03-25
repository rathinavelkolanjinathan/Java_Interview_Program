package org.java.CoreJava.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVSTreeSet {
    public static void main(String[] args) {


        Set<String> hashSet = new HashSet<>();
        hashSet.add("kolanji");
        hashSet.add("manikandan");
        hashSet.add("priya");
        hashSet.add("Anadharaj");
        hashSet.add(null);
        hashSet.add("Anadharaj");
        hashSet.add(null);
        System.out.println("Hash set"+hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("kolanji");
        treeSet.add("manikandan");
        treeSet.add("priya");
        treeSet.add("Anadharaj");
        //treeSet.add(null); // not allowed
        treeSet.add("Anadharaj");


        System.out.print("Tree set"+treeSet);

    }
}
