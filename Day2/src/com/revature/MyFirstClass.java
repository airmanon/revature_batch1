package com.revature;

import java.util.Date;

import com.revature.accessmodifiers.AccessModifierDemo;

//Name of the Class
/* This is an example
 * for multi line comment
 */

/** This is example for the documentation 
 * comment
 * @author Siva
 *
 */

public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  -- single line comment
		Employee employee = new Employee();
		
		//Left hand side employee is a Employee Object Reference
		//Right hand side, we have the employee object
		
		
		Employee employee1 = employee;
		//Object referenes will be stored in stack area
		System.out.println("Employee Object is :" + employee);
		employee.setName("test");
		System.out.println("Employee1 Object is :" + employee1);
		
		System.out.println("employee object hashcode is :" + employee.hashCode());
		System.out.println("employee1 object hashcode is :" + employee1.hashCode());
		
		Date today = new Date();
		System.out.println(today);
		
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date);
		
		AccessModifierDemo obj = new AccessModifierDemo();
		
		SubClass obj1= new SubClass();
		
	}

}
