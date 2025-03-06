package org.test.coreJavaprogram.threadprogram;

public class CountDownTestQATeam extends Thread {
	
	public CountDownTestQATeam( String name) {
		super(name);
		

	}

	public void run() {
		System.out.println("Task Assigned To " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
System.out.println(Thread.currentThread().getName());		

	}

}
