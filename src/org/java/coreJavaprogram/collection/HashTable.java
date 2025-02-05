package org.collection;

import org.algorithm.Factorial;

import java.util.Hashtable;
import java.util.logging.Logger;

public class HashTable {
	private static final Logger logger = Logger.getLogger(HashTable.class.toString());
	public static void main(String[] args) {

		// Creating Hashtable object
		Hashtable<Integer, String> ht = new Hashtable<>();

		// Adding entry to Hashtable
		// Custom input entries
		ht.put(65, "A");
		ht.put(65, "C");
		ht.put(67, "C");
		ht.put(68, "D");

		// Print and display the HashTable elements
		logger.info("hashtable "+ht);
	}
}
