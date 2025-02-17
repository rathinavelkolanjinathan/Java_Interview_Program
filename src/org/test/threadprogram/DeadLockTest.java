package org.test.threadprogram;

public class DeadLockTest {
    static Thread thread;

    public void run() {
        try {
			thread.join();
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

        JoinTest joinTest = new JoinTest();
		joinTest.setName("Sub1");
        // mt.start();

		joinTest.start();
		joinTest.join();
        //mt.join();
        for (int i = 0; i < 10; i++) {

            System.out.println("Main -" + Thread.currentThread().getName());
            // Thread.sleep(3000);
        }
    }
}
