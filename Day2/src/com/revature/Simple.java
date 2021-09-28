package com.revature;

import java.io.Serializable;


public class Simple implements Serializable {

	private int id;
	private String name;

	public static void main(String[] args) {
		Simple obj = new Simple();
		

		obj.id = 5;
		obj.name = "test";

		System.out.println(obj);

		Vehicle v1 = new Car();

		v1.accelerate();
		v1.applyBreak();
	}

	@Override
	public String toString() {
		return "Simple [id=" + id + ", name=" + name + "]";
	}

}
