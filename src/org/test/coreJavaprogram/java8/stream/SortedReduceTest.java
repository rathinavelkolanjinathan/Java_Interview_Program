package org.test.coreJavaprogram.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedReduceTest {

	public static void main(String[] args) {
		List<Integer>  l=new ArrayList();
		l.add(7);
		l.add(5);
		l.add(2);
		l.add(4);
		l.add(1);
		l.add(6);
		l.add(3);
		l.add(9);
		l.add(10);
		Stream<Integer> s=l.stream();
		Stream ss=s.sorted();
		
		ss.forEach((x)->System.out.println(x));
		//System.out.println(ss);
	}
}
