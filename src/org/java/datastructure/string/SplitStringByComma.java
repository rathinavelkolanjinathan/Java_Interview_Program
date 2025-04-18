package org.java.datastructure.string;

import java.util.ArrayList;

import java.util.Arrays;
public class SplitStringByComma {
	public static void main(String args[]) {
		// You can use the split() method to split a 
		// stringDemo where words are separated by comma.
		// since split() method expect a regular expression
		// you can pass "," to it as well, as shown below: 
		String languages = "Java,JavaScript,C++,Python,Ruby,Scala"; 
		// splitting stringDemo by comma, it will return array
		String[] array = languages.split(",");

		// if you want, you can convert array to ArraList as shown below 
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

		// let's print input and output 
		System.out.println("comma separated stringDemo: " + languages);
		System.out.println("array of stringDemo: " + Arrays.toString(array));
		System.out.println("list of stringDemo: " + list);

		// In case your CSV stringDemo contains leading or trailing spaces
		// call trim() before calling split() to avoid leading
		// space on first and last word.

		String CSVWithLeadingSpace = " XBOX,PlayStation,Wii ";
		String[] withoutTrim = CSVWithLeadingSpace.split(",");
		String[] afterTrimming = CSVWithLeadingSpace.trim().split(",");
		System.out.println("CSV stringDemo with leading and trailing space: " + CSVWithLeadingSpace);
		System.out.println("words without trim: " + Arrays.toString(withoutTrim));
		System.out.println("words after trim: " + Arrays.toString(afterTrimming));
		}
	}


