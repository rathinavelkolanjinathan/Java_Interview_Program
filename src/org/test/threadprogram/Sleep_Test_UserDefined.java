package org.java.threadprogram;

public class Sleep_Test_UserDefined extends Thread {

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

		Sleep_Test_UserDefined tt = new Sleep_Test_UserDefined();
		tt.setName("Sub1");
		tt.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("Main -" + Thread.currentThread().getName());
			Thread.sleep(3000);
		}
	}
}
