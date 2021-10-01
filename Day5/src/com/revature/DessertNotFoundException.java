package com.revature;

public class DessertNotFoundException extends RuntimeException {
	private String message;

	public DessertNotFoundException(String message) {
		super();
		this.message = message;
	}

}
