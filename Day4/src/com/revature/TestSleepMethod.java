package com.revature;

public class TestSleepMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println( Thread.currentThread().getName()+ " " +i);
		}
	}

	public static void main(String args[]) {
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		t1.setName("ABC");
		t1.setPriority(MAX_PRIORITY);
		t2.setName("XYZ");
		t1.start();
		t2.start();
	}
}
