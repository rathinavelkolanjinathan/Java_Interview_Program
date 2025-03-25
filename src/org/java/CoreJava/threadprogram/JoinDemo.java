package org.java.CoreJava.threadprogram;

public class JoinDemo extends Thread {

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

		JoinDemo tt = new JoinDemo();
		tt.setName("Sub1");
		tt.start();
        tt.join();
		for (int i = 0; i < 10; i++) {

			System.out.println("Main -" + Thread.currentThread().getName());
			Thread.sleep(3000);
		}
	}
}
