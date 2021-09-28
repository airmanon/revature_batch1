package com.revature;

public class Voting {
	public static void main(String[] args) {
		int age = 17;

		try {
			if (age < 18) {
				throw new InvalidAgeException();
			}

			System.out.println("No exception thrown");
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}

		System.out.println("Program Ends Here!!!!");

	}
}
