package com.revature.accessmodifiers;

public class AccessModifierDemo {
	
	private int id; //with-in this class using the public methods
	String name; //with-in this class, with-in this package 
	protected String email; //with-in the class, with-in package, sub-class in any package
	public long mobile; //all the places
	
	public void display() {
		System.out.println(id + ", " + name + ", " + email + ", "+mobile );
	}

}
