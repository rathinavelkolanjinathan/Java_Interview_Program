package org.java.coreJavaprogram.java8.flatmapVSmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {
public static void main(String[] args) {
	ArrayList<String>li=new ArrayList<String>();
	li.add("core java");
	li.add("j2ee");
	li.add("val");
	Stream<String>ll = li.stream().flatMap((String x) -> {
		String [] a = x.split("");
	return Arrays.asList(a).stream();
	
	});
	//List<String>ss=ll.collect(Collectors.toList());
	
	ll.forEach((x) ->{System.out.println(x+""+x.length());
	});
}
	
}