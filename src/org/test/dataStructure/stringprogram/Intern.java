package org.test.dataStructure.stringprogram;

public class Intern {

	public static void main(String[] args) {
		String s="kolanji";
		String t="kolanji";
		if(s.intern()==t) {
			System.out.println("equal");
			
		}
		if(s.equals(t)) {
			
			System.out.println("test");
		}
	}
}
