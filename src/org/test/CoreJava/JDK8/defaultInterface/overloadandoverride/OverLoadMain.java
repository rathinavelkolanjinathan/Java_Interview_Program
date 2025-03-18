package org.test.CoreJava.JDK8.defaultInterface.overloadandoverride;

public class OverLoadMain implements I {

	@Override
	public void m1() {
		System.out.println("Parent Class Inheritance");
		
	}
	@Override
	public void m2(int value) {
		
		System.out.println("M2 Values "+value);
	}



}
