package org.test.coreJavaprogram.threadprogram;

public class SleepTestUserDefined extends Thread {

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

        SleepTestUserDefined tt = new SleepTestUserDefined();
        tt.setName("Sub1");
        tt.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Main -" + Thread.currentThread().getName());
            Thread.sleep(3000);
        }
    }
}
