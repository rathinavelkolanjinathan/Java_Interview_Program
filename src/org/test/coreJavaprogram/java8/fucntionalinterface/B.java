package org.test.coreJavaprogram.java8.fucntionalinterface;

public interface B extends A {

	default void display2()  {
		
		System.out.println("Display 2");
	}
}
