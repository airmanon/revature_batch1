package com.revature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List nameList = new ArrayList();
		nameList.add("name1");
		nameList.add("name2");
		nameList.add("name4");
		nameList.add("name5");
		nameList.add("name1");
		Iterator iterator = nameList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		
	}
}
