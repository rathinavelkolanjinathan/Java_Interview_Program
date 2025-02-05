package org.java.threadprogram;

public class Snchronized_Test2 {
	public static void main(String[] args) {
		Institute2 ins=new Institute2();
		MyThread1 m1 =new MyThread1(ins, "Raj");
		MyThread1 m2=new MyThread1(ins, "kolanji");
		m1.start();
		m2.start();
		ins.exam();
	}
}
