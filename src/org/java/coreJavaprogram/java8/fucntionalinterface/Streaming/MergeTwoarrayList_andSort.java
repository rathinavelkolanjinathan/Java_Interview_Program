package org.java.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoarrayList_andSort {
	 public static void main(String[] args) throws Exception 
	    {
	        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
	         
	        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
	         
	        List<String> combinedList = Stream.of(listOne, listTwo)
	                                        .flatMap(x -> x.stream())
	                                        .collect(Collectors.toList());
	        
	        ArrayList<Integer> list=new ArrayList();
	        ArrayList<Integer> list2=new ArrayList();
	        
	        for(int i=0;i<1000;i++) {
	        	list.add(i);
	        	
	        }
	        for(int i=1001;i<2000;i++) {
	        	list2.add(i);
	        	
	        }
	        ArrayList<Integer> combinedList1  =(ArrayList) Stream.of(list,list2).sorted();
	        
	        combinedList1.forEach(e->System.out.println(e));
	        System.out.println(combinedList);
	    }
}
