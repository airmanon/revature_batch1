package com.revature;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 =  Singleton.getInstance(10);
		obj1.display();
		Singleton obj2 =  Singleton.getInstance(20);
		obj2.display();
		obj1.display();
	}

}
