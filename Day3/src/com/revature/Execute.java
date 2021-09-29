package com.revature;

import java.util.ArrayList;

interface MyFunctionalInt {
	int doMath(int number);
}

public class Execute {
	public static void main(String[] args) {
		MyFunctionalInt obj1 = new MyFunctionalInt() {

			@Override
			public int doMath(int number) {
				// TODO Auto-generated method stub
				return number * 2;
			}
		};

		MyFunctionalInt obj2 = new MyFunctionalInt() {

			@Override
			public int doMath(int number) {
				// TODO Auto-generated method stub
				return number - 5;
			}
		};

		System.out.println(obj1.doMath(5)); // 10
		System.out.println(obj2.doMath(25)); // 20

		MyFunctionalInt doubleIt = n -> n * 2;
		MyFunctionalInt subtractIt = n -> n - 2;
		int result1 = doubleIt.doMath(2);
		int result2 = subtractIt.doMath(8);
		System.out.println(result1); // 4
		System.out.println(result2); // 6

		// Ctrl+shift + O (organize imports)
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

//		numbers.fo
		numbers.forEach(n -> System.out.println(n));
	}
}