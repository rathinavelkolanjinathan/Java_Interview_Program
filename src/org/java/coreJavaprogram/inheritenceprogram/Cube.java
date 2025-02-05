package org.java.coreJavaprogram.inheritenceprogram;

public interface Cube {
	public default void cal(int x) {

		System.out.println("cube values "+x);
	}
}
