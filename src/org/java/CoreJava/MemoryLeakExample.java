package org.java.CoreJava;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private List<String> list = new ArrayList<>();

    public void addToList(String item) {
        list.add(item); // Adding items to the list
    }

    public static void main(String[] args) {
        MemoryLeakExample example = new MemoryLeakExample();

        // Simulating memory leak by adding items in a loop
        for (int i = 0; i < 100000; i++) {
            example.addToList("Item " + i);
        }

        // Intentionally not clearing the list to retain references
        // This can lead to a memory leak
    }
}
