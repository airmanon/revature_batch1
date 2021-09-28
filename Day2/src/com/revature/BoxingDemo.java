package com.revature;

public class BoxingDemo {

	public static void main(String[] args) {
		// primitive data types
		int id; // variable declaration
		float number1;
		double number2;
		// variable initialization
		id = 25;
		number1 = 34.765f;
		number2 = 45.78;
		
		Integer intObj = new Integer(id); //manual boxing
		
		Integer intObj1 = id;   // auto boxing
		
		Float floatObj = new Float(number1);
		
		intObj.intValue(); //manual unboxing
		
		System.out.println(intObj1); // auto unboxing
		
		
	}

}
