package com.revature.model;

public class NewChild extends PolymorphismDemo {
	
	public void add(int a, int b) {
		System.out.println("result of child is :" + (a+b));
	}
	public void add(float a, int b) {
		System.out.println("result of child is :" + (a+b));
	}
	public void add(float a, float b) {
		System.out.println("result of child is :" + (a+b));
	}
	public void add(int a, float b) {
		System.out.println("result of child is :" + (a+b));
	}
}
