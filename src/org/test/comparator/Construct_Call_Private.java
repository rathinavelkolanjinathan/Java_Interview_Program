package org.test.comparator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Construct_Call_Private {
public static void main(String[] args) {
	
	try {
		Class cc=Class.forName("Constructor_Private");
		
		Constructor con[]=cc.getDeclaredConstructors();
		con[0].setAccessible(true);
		try {
			con[0].newInstance(null);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
