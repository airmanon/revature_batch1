package com.revature;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int a = 5, b = 2;
		int array[] = { 4, 5, 8 };
		try {
			System.out.println(a / b);
			System.out.println(array[5]);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("inside finally block");
		}

	}
}
