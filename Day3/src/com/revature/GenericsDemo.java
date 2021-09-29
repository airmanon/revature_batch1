package com.revature;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("abc");
		nameList.add("xyz");
		nameList.add("pqr");
		nameList.add("5");
		
		List<Object> generalList = new ArrayList<Object>();
		generalList.add(5);
		generalList.add(7.8f);
		generalList.add(100.6457);
		generalList.add(9878675645l);
		generalList.add('v');
		generalList.add("test");
		generalList.add(new MyChild());
		
		for (Object object : generalList) {
			System.out.println(object);
		}
	}
}
