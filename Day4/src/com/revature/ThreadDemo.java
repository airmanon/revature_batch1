package com.revature;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread("ABC");
		t1.setPriority(4);
		t1.start();
//		t1.wait(10000);
		System.out.println("t1 ID : " + t1.getId());
		System.out.println("t1 Name:" + t1.getName());
		System.out.println("t1 priority :" + t1.getPriority());
		System.out.println("t1 is Alive :" + t1.isAlive());
//		t1.run();
		MyThread t2 = new MyThread();
		t2.start();
//		t2.sleep(1000);
//		t2.wait(5000);
		System.out.println("t2 ID : " + t2.getId());
		System.out.println("t2 Name:" + t2.getName());
		System.out.println("t2 priority :" + t2.getPriority());
//		t2.resume();
		System.out.println("t2 is Alive :" + t2.isAlive());

	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Thread is Running!!!!");
	}
}