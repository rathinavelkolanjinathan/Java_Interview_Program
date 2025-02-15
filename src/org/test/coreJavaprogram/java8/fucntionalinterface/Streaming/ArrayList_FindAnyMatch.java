package org.java.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayList_FindAnyMatch {
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		
		l.add(3);
		l.add(4);
		l.add(5);
		Stream st=l.stream();
		boolean b=st.anyMatch((x)->{
			
			return x.equals(4);
		});
		System.out.println("Booleans"+b);
	}
}
