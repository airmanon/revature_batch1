package com.revature;

import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		String myText = null;
		System.out.println("Please Enter a String for myText:");
		myText = scan.nextLine();
		System.out.println("MyText value is :" + myText);
		System.out.print("Please Enter a number for a :");
		a = scan.nextInt();
		System.out.print("Please Enter a number for b :");
		b = scan.nextInt();
		if (a > b) {
			System.out.println("a is bigger " + a);
		} else {
			System.out.println("b is bigger " + b);
		}

//		Arrayd
		scan.close();
	}

}
