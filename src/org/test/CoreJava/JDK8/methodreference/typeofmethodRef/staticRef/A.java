package org.test.CoreJava.JDK8.methodreference.typeofmethodRef.staticRef;

public class A {
	static public void test(){
		System.out.println("This is implementation m-i");
	}

	public static void main(String[] args) {
		I obj = A::test;
		obj.m1();
	}
}
