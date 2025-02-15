package org.java.threadprogram;

public class Sysnchronized_Test  {
public static void main(String[] args) {
	Institute ins=new Institute();
	MyThread m1 =new MyThread(ins, "Raj");
	MyThread m2=new MyThread(ins, "kolanji");
	m1.start();
	m2.start();
}
}
