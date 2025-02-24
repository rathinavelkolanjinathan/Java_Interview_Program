package org.test.coreJavaprogram.JDK21.SequenceCollections;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;
//SequencedSet. It extends the SequencedCollection & Set interfaces.
// It means SequencedSet inherits all the methods of SequencedCollection.
public class SequencedSetExample {
    public static void main(String[] args) {

        SequencedCollection<String> set = new LinkedHashSet<>();

        // Adding elements
        set.addFirst("Alice");
        set.addLast("Bob");
        set.addFirst("Charlie");

        // Accessing elements
        System.out.println("First: " + set.getFirst());
        System.out.println("Last: " + set.getLast());

        // Removing elements
        set.removeFirst();
        set.removeLast();
        System.out.println("Remaining: " + set);
    }
}
