package org.test.CoreJava.JDK8.defaultInterface.inheritence;

public interface Cube {
	default void calc(int x) {

		System.out.println("Cube-calc");
	}
}
