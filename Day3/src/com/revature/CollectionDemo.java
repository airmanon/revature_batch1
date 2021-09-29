package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numberList =new ArrayList() ;
		int x=25;
		numberList.add(5);
		numberList.add(7);
		numberList.add(x); //auto boxing
		numberList.add(10);
		numberList.add(5);
		numberList.add(10);
//		numberList.add(null);
		numberList.add(7);
//		numberList.add(null);
		
		Collections.sort(numberList);
		
		System.out.println("Number List is :" + numberList);
		System.out.println(numberList.indexOf(5));
		System.out.println(numberList.contains(4));
		System.out.println(numberList.lastIndexOf(5));
		System.out.println(numberList.size());
		
		System.out.println("Arraylist Content");
		//traversing through arraylist - method1 using simple for loop
		for (int i=0;i<numberList.size();i++) {
			System.out.println(numberList.get(i));
		}
		System.out.println("Arraylist Content -using  for each");
		//method 2 - Enhanced for loop (for each loop)
		for (Object object : numberList) {
			System.out.println(object);
		}
		//method 3 Using Iterator
		System.out.println("Arraylist Content -using iterator");
		Iterator itr = numberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
