package org.test.coreJavaprogram.JDK21.SequenceCollections;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
//The SequencedMap is useful for the Map interfaces & classes. It does not extend
// the SequencedCollection, but provides its own methods that apply the access order to map
// entries in place of individual elements. Here are some important methods of SequencedMap:
public class SequencedMapTest {
    public static void main(String[] args) {

        // Create a SequencedMap using LinkedHashMap
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        // Adding entries
        map.putFirst("Alice", 25);
        map.putLast("Bob", 30);
        map.putLast("Charlie", 35);

        // Accessing first and last entries
        System.out.println("First Entry: " + map.firstEntry()); // Output: Alice=25
        System.out.println("Last Entry: " + map.lastEntry()); // Output: Charlie=35

        // Removing entries
        map.pollFirstEntry();
        System.out.println("After removeFirst: " + map); // Output: {Bob=30, Charlie=35}
        map.pollLastEntry();
        System.out.println("After removeLast: " + map); // Output: {Bob=30}
    }
}
