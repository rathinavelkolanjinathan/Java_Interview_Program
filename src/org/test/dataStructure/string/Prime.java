package org.test.dataStructure.string;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		// xyabxyae ,dezefkykze not Prime
		// abefdeyz,abcdefg prime
		String values = "abcdefg";
		Prime prime = new Prime();
		String val = prime.getPrime(values);
		System.out.println(val);
	}

	public String getPrime(String values) {
		Map<Character, Integer> m = new HashMap<>();
		int count = 0;
		for (int i = 0; i < values.length(); i++) {
			char c = values.charAt(i);
			if (m.containsKey(c)) {
				count++;
				return "not Prime ";
			} else {
				m.put(c, 1);
			}
		}
		return " prime";
	}
}
