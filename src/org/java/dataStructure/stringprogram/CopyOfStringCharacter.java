package org.java.dataStructure.stringprogram;

public class CopyOfStringCharacter {


	public static void main(String[] args) {
		char[] arr = { 'p', 'q', 'r', 's' };
		String str = String.copyValueOf(arr, 1, 2);
		System.out.println("copy of value"+str);

		String st = "hello";

		char cc[] = st.toCharArray();

		StringBuilder build = new StringBuilder();
		for (int i = 0; i < cc.length; i++) {
			build.append(cc[i]);
			build.append(cc[i]);

		}
		System.out.println("Copy of Character>>>>>>::: " + build);

	}

}
