package com.revature;

public class GenericClass<T> {
	private T instance;

	// simple generic setter method
	public void setObject(T object) {
		this.instance = object;
	}
	
	public void display(T obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		GenericClass<MyChild> stringGeneric = new GenericClass<MyChild>();
		MyChild obj1= new MyChild();
		stringGeneric.display(obj1);
	}
}