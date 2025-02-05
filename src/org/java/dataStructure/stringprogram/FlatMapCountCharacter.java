package org.java.dataStructure.stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapCountCharacter {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		//System.out.println("list size"+list.size());
		list.add("corejava advancedjava orcle");
		list.add("NIIT KANPUR");
		list.add("iit chennai");
		list.add("values  chennai");

		Stream<String> streamVal = list.stream().flatMap((String str) -> {
			String[] value = str.split(" ");
			return Arrays.asList(value).stream();

		});

		// System.out.println(val.count());
		//List<String> li1 = val.collect(Collectors.toList());
		streamVal.forEach((result) -> {
			System.out.println(result+"...."+result.length());
		});

		// Unique values using flatmap
		List < String > words = Arrays.asList("JavaDevJournal", "Java");
		List < String > unique = words.stream()
				.map(str -> str.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());

		System.out.println("Unique values "+unique);
	}
	

}
