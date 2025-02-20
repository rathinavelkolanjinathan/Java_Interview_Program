package org.test.coreJavaprogram.java8.fucntionalinterface;

public interface DefaultInterfaceB extends DefaultInterfaceA {

	default void display2()  {
		
		System.out.println("Display 2");
	}
}
