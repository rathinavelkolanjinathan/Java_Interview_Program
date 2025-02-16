package org.test.coreJavaprogram.java8.methodreference;

public class RefStaticMethodMain {

	public static void main(String[] args) {
		
		Thread t=new Thread(ReferenceStaticMethod::satThread);
		t.start();
	}
}
