package org.java.coreJavaprogram.inheritenceprogram;

public class Launcher implements Square,Cube {

	@Override
	public void cal(int x) {
		
		Cube.super.cal(160);
		Square.super.cal(161);
	}
	
	public static void main(String[] args) {
		Launcher la=new Launcher();
		la.cal(100);
	}

}
