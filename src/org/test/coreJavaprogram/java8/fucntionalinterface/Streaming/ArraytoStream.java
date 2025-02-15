package org.java.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.stream.Stream;

public class ArraytoStream {
public static void main(String[] args) {
	
	String []value= {"naresh","apple","oracle","neyveli"};
	
	Stream <String>ss=Stream.of(value);
	Stream sort=ss.sorted();
	sort.forEach((x)->System.out.println(x));
	
	Stream<String> st=Stream.of("xyz","tyr","nh");
	
	System.out.println(st.count());
}
}
