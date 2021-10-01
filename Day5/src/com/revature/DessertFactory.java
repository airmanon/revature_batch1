package com.revature;

// Factory class that returns the concrete instance
public class DessertFactory {
	public static Dessert getDessert(String dessertType) {
		switch (dessertType) {
		case "cake":
			return new Cake();
		case "cookie":
			return new Cookie();
		case "ice cream":
			return new IceCream();
		default:
			throw new DessertNotFoundException(dessertType + " not found!");
		}
	}
}