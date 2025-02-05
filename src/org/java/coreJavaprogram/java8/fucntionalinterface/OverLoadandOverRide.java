package org.java.coreJavaprogram.java8.fucntionalinterface;

public interface OverLoadandOverRide {
	public abstract void m1();

	public default void m2(int x) {

		System.out.println("default m2"+x);
	}

	public default void m3() {

		System.out.println("Default m3");
	}
}
