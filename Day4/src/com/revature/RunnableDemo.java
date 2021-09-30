package com.revature;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running!!!");
	}

	
	public static void main(String[] args) {
		RunnableDemo runnableObject = new RunnableDemo();
		Thread t1 = new Thread(runnableObject,"MyRunnableThread");
		System.out.println("Running Thread Name :"+Thread.currentThread().getName());
		runnableObject.run();
		try {
			Thread.sleep(1000);
			t1.suspend();
			System.out.println(t1.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(t1.getName());
		System.out.println("Running Thread Name :"+Thread.currentThread().getName());
		System.out.println(t1.isDaemon());
		
	}
}
