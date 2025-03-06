package org.test.coreJavaprogram.threadprogram;

public class JoinTest extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("run -" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {

		JoinTest tt = new JoinTest();
		tt.setName("Sub1");
		tt.start();
        tt.join();
		for (int i = 0; i < 10; i++) {

			System.out.println("Main -" + Thread.currentThread().getName());
			Thread.sleep(3000);
		}
	}
}
