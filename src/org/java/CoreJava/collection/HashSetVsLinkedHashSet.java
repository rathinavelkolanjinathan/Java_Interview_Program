package org.java.CoreJava.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetVsLinkedHashSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("kolanji");
        hashSet.add("manikandan");
        hashSet.add("priya");
        hashSet.add("Anadharaj");
        hashSet.add(null);
        hashSet.add("Anadharaj");
        hashSet.add(null);

        System.out.println("Hash Set Values------------------"+hashSet);

        Set<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("kolanji");
        linkedHashSet.add("manikandan");
        linkedHashSet.add("priya");
        linkedHashSet.add("Anadharaj");
        linkedHashSet.add(null);
        linkedHashSet.add(null);// it's not allowed
        System.out.println("linkedHashSet  Values------------------"+linkedHashSet);
    }
}
