package com.revature;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList cityList = new LinkedList();

		cityList.add("Chennai");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		
		Collections.sort(cityList);
		
		System.out.println(cityList);
				
	}

}
