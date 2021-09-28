package com.revature;

import com.revature.model.Child;

public class ArraysDemo {

	public static void main(String[] args) {
		int intArray[] = new int[10]; // declaring an integer array with the size 10
		int[] intArray1 = { 2, 5, 9, 7, 8, 10, 25, -7, -35 }; // declaring & initializing an array

//		System.out.println(intArray + " " + intArray1);

		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}

		char nameArray[][] = new char[20][25];
		int nameArray1[][] = { { 2, 3, 5, 6 }, { 3, 6, 4, 7 }, { 45, 34, 28, 61 } };

		for (int[] is : nameArray1) {
			for (int j : is) {
				System.out.print(j + ",");
			}
			System.out.print("\n");
		}
		
		//Heterogeneous array
		Object objArray[] = {1, 5.0, 7.89f, true, 'c',"Test", new Employee(), new Child(200, "sample"),986756453412l};
		
		for (Object object : objArray) {
			System.out.println(object);
		}
	}

}
