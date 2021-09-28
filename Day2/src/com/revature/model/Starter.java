package com.revature.model;

public class Starter {
	//instance/member variable
	private int id;
	private final float pi = 3.14f;
	//class/static variable (shared by all the objects)
	private static String name;
	
	

	public void setId(int id) {
		this.id = id;
	}



	public static void setName(String name) {
		Starter.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=5;
		Starter obj1 = new Starter();
		obj1.setId(20);
		Starter.setName("test");
		System.out.println("id ="+obj1.id + " name =" + Starter.name);
		Starter obj2 = new Starter();
		obj2.setId(50);
		Starter.setName("sample");
		System.out.println("id ="+obj2.id + " name =" + obj1.name);
		System.out.println("id ="+obj1.id + " name =" + Starter.name);
		
		
		Parent p1 = new Parent();
		
		Child c1 = new Child(200, "child1");
		
		c1.age = 25;
		c1.buildings = "Palace";
		c1.car = "audi";
		
		System.out.println(c1);
		
//		Child c2 = new Parent();
		
		Parent p2 = new Child(250, "child2");
		
		System.out.println(p2);
		
		//Annonymous inner class 
		AbstractClass abstractObj = new AbstractClass() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
}
