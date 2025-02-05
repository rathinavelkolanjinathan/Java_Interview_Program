package org.java.threadprogram;

public class DeadLock_Test {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run -" + Thread.currentThread().getName());

		}
	}

	public static void main(String[] args) throws InterruptedException {

		Join_Test_ tt = new Join_Test_();
		tt.setName("Sub1");
		// mt.start();
		
		tt.start();
		tt.join();
		//mt.join();
		for (int i = 0; i < 10; i++) {

			System.out.println("Main -" + Thread.currentThread().getName());
			// Thread.sleep(3000);
		}
	}
}
