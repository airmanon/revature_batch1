package com.revature;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int[] array = { 3, 5, 7 };
		// unchecked run-time exception

		try {
			System.out.println(a / b);
			System.out.println(array[2]);
			throw new Throwable();

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			// highly resource consuming code -- costlier operation
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());

		} finally {
			System.out.println("inside finally");
		}
		System.out.println("completed!!");
	}
}
