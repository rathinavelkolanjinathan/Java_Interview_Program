package org.test.CoreJava.threadprogram;

public class JoinCallMain extends Thread {
	
	static Thread th;
	@Override
	public void run() {
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {

			System.out.println("run -" + Thread.currentThread().getName());
			
		}
	}
	public static void main(String[] args) throws InterruptedException {

		JoinCallMain tt = new JoinCallMain();
		th=Thread.currentThread();
		tt.setName("Sub1");
		tt.start();
        
		for (int i = 0; i < 10; i++) {

			System.out.println("Main -" + Thread.currentThread().getName());
			//Thread.sleep(3000);
		}
	}
}
