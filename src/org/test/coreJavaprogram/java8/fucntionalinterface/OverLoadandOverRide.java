package org.java.coreJavaprogram.java8.fucntionalinterface;

public interface OverLoadandOverRide {
	 abstract void m1();

	 default void m2(int x) {

		System.out.println("default m2"+x);
	}

	 default void m3() {

		System.out.println("Default m3");
	}
}
