package com.revature.model;

public class PolymorphismDemo {
	//method overloading -- static polymorphism --- compile time polymorphism
	
	public void add(int a, int b) {
		System.out.println("result is :" + (a+b));
	}
	public void add(float a, int b) {
		System.out.println("result is :" + (a+b));
	}
	public void add(float a, float b) {
		System.out.println("result is :" + (a+b));
	}
	public void add(int a, float b) {
		System.out.println("result is :" + (a+b));
	}
	
	public static void main(String[] args) {
		PolymorphismDemo obj1 = new PolymorphismDemo();
		obj1.add(5, 7);
		obj1.add(7.5f, 4.2f);
		obj1.add(4, 4.2f);
		obj1.add(2.5f, 8);
		
		NewChild obj2 = new NewChild();
		obj2.add(5, 7);
		obj2.add(7.5f, 4.2f);
		obj2.add(4, 4.2f);
		obj2.add(2.5f, 8);
		
		PolymorphismDemo obj3 = new NewChild();
		obj3.add(5, 7);
		obj3.add(7.5f, 4.2f);
		obj3.add(4, 4.2f);
		obj3.add(2.5f, 8);
		
		System.gc();
	}
}
