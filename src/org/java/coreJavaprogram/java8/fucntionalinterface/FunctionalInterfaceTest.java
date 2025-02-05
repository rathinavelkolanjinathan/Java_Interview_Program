package org.java.coreJavaprogram.java8.fucntionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceTest {
	public abstract void m1();

	public default void m2() {

		System.out.println("M2 Method");
	}

	public default void m3() {

		System.out.println("Method M3");
	}

	public static void m4() {

		System.out.println("Static Methpod 4 ");
	}
	public static void m5() {

		System.out.println("Static5 Method 5 ");
	}
}
