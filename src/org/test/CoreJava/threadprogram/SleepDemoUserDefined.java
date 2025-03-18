package org.test.CoreJava.threadprogram;

public class SleepDemoUserDefined extends Thread {

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

        SleepDemoUserDefined sleepDemoUserDefined = new SleepDemoUserDefined();
        sleepDemoUserDefined.setName("Sub1");
        sleepDemoUserDefined.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Main -" + Thread.currentThread().getName());
            Thread.sleep(3000);
        }
    }
}
