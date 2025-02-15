package org.java.coreJavaprogram.java8.lamdaexpression;

public class Launch {

	static void  m1(MethodRefInterface i) {
		System.out.println(i.area(89));
		
	}
	public static void main(String[] args) {

		MethodRefInterface a=  (int x)->{
			return x*x;
			};
		m1(a);
	}
	
}
