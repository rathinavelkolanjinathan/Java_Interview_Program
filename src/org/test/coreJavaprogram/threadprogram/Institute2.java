package org.test.coreJavaprogram.threadprogram;

public class Institute2 {

    synchronized public void classRoom(String facultyName) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i + "Taking for" + facultyName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void exam() {

        for (int i = 0; i < 10; i++) {

            System.out.println(i + "writing " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    Institute2 ins;
    String facultyName;

    public void run() {
        ins.classRoom(facultyName);
    }

    MyThread1(Institute2 inst, String facutyName) {

        this.ins = inst;
        this.facultyName = facutyName;
    }

}