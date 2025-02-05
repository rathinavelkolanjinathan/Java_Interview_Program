package org.java.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.Optional;

public class Optional_Test {

	public static void main(String[] args) {
		String st[]=new String[5];
		st[0]="Kolanji";
		st[1]="nathan";
		
		
		Optional<String> o= Optional.ofNullable(st[2]);
		if(o.isPresent()) {
			
			System.out.println("Values of "+o.get().toUpperCase());
		}else {
			
			System.out.println("Values does not found");
		}
	}
}
