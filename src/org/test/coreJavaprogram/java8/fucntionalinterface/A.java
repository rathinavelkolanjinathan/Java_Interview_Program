package org.java.coreJavaprogram.java8.fucntionalinterface;

public interface A {
default void dispaly() {
	
	System.out.println("Super Interface");
	
	if(this instanceof B) {
		((B) this).display2();
		
	}
}
}
