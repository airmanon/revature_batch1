package com.revature;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set emailSet = new HashSet();
		
		emailSet.add("user1@revature.com");
		emailSet.add("user2@revature.com");
		emailSet.add("user3@revature.com");
		emailSet.add("user4@revature.com");
		emailSet.add("user1@revature.com");
		emailSet.add(null);
			
		System.out.println(emailSet);
	}

}
