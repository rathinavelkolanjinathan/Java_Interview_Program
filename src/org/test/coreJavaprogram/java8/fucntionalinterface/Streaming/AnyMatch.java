package org.test.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {

		//Find the array list given integer values is Available or not 
		
		ArrayList<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		
		l.add(3);
		l.add(4);
		l.add(5);
		Stream stre=l.stream();
		boolean b=stre.anyMatch((x)->{return x.equals(4);});
		System.out.println("Integer Results::"+b);
		
		
		//find the given string values Available in list 
		ArrayList<String> list = new ArrayList<String>();
		list.add("corejava advancedjava orcle");
		list.add("NIIT KANPUR");
		list.add("iit chennai");
		list.add("values  chennai");
		Stream <String>st=list.stream();
		//boolean b=st.anyMatch((x)->{return x.startsWith("c");
		//find allmatch values 
				boolean bb=st.allMatch((x1)->{return x1.startsWith("c");
						});
		boolean matchingResults=st.noneMatch((xx)->{return xx.startsWith("c");
		
		});
		System.out.println("String Results::"+matchingResults);
		
		System.out.println("AllMatch Results "+bb);
	}
}
