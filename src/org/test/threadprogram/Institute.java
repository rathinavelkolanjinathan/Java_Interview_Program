package org.test.threadprogram;
/**
 * This is example of Institute class using thread
 */

public class Institute {

    private static final int MULTIPLIER = 10;

    private static final int SLEEP = 10;
    /**
     * This method is classroom
     * @param facultyName
     */
    synchronized public void classRoom(final String facultyName) {

        for (int i = 0; i < MULTIPLIER; i++) {

            System.out.println(i + "Taking for" + facultyName);
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Mythread class extends Thread
 */
class MyThread extends Thread {
	private Institute ins;
    private String facultyName;

    /**
     * run method
     */
	public void run() {
		ins.classRoom(facultyName);
	}

    /**
     *
     * @param inst
     * @param facutyName
     */
	MyThread(final Institute inst, final String facutyName) {

		this.ins = inst;
		this.facultyName = facutyName;
	}

}
