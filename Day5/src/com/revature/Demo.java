package com.revature;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+args[1]);
		System.out.println(Integer.parseInt(args[0])+ Integer.parseInt(args[1]));
		Dessert d1 = DessertFactory.getDessert("cake");
		Dessert d2 = DessertFactory.getDessert("cookie");
		Dessert d3 = DessertFactory.getDessert("ice cream");
		Dessert d4 = DessertFactory.getDessert("candy"); // Throws DessertNotFoundException

	}

}
