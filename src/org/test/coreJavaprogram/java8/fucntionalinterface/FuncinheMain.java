package org.java.coreJavaprogram.java8.fucntionalinterface;

public class FuncinheMain {

	public static void main(String[] args) {

		FunctionIn2 fun = new FunctionIn2() {

			@Override
			public void m1() {

				System.out.println("Hello values ");
			}
		};
		fun.m1();

	}

}
