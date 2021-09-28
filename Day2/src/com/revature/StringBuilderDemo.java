package com.revature;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder obj = new StringBuilder("Hello World");
		String str = new String("Hello World");

		// mutable string -- modifiable string
		obj.append(str);
		System.out.println(obj);

		for (int i = 0; i < 256; i++) {
			System.out.println((char) i); // type casting -- converting one primitive to another primitive type
		}

	}
}
