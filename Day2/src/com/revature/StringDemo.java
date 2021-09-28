package com.revature;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello World"; // Initializing String object in literal way

		String str1 = new String("Welcome to JAVA!!!"); // Initializing String object in object way

		System.out.println(str.charAt(10));
		System.out.println(str + " " + str1);
		
		String str2 = new String("Hello World");
		
		System.out.println(str==str2); //checking the type & value
		System.out.println(str.hashCode() + " " + str2.hashCode());
		System.out.println(str.equals(str2)); //checking the values 
		
//		System.out.println(str.);
	}

}
