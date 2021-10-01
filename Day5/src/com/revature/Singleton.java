package com.revature;

public class Singleton {
	// Private static variable of the class' type
	private static Singleton instance;
	private static int value;

	// Private Constructor
	private Singleton(int value) {
		Singleton.value=value;
	}

	// Public static getInstance method
	public static Singleton getInstance(int value) {
		if (instance == null)
			instance = new Singleton(value);
		return instance;
	}
	
	public static void display() {
		System.out.println(value);
	}
}
