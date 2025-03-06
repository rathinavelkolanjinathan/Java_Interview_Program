package org.test.coreJavaprogram.threadprogram;

import java.util.concurrent.CountDownLatch;

public class CountDownDevB extends Thread {
	
	private CountDownLatch countDownLatch;

	public CountDownDevB(CountDownLatch count, String name) {
		super(name);
		this.countDownLatch = count;

	}

	public void run() {
		System.out.println("CountDownDEVB Task " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished the devtools" + Thread.currentThread().getName());
		countDownLatch.countDown();

	}

}
