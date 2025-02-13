package org.java.dataStructure.stringprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringJoiner;

public class JoinerTest {
	public static void main(String a[]){
		
		String st="kolanji";
		
		String st1=String.join("-","access" ,st,".");
		
		System.out.println("values "+st1);
		

		StringJoiner join=new StringJoiner(",","{","}") ;
		join.add("hello");
		join.add("how are");
		join.add("doin java");
		join.add("vel");
		System.out.println(join);
		
		try {
			Files.list(Paths.get(".")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
