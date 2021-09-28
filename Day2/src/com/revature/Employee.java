package com.revature;

public class Employee {
	//keyword for declaring integer primitive variable
	private int id;
	//Special data type (class)
	private String name;
	private int age;
	private String email;
	private long mobile;
	
	//Special method called constructor
	//Constructor will help to initialize the properties with default values
	//Constructor 
	//default/empty constructor (no arguments)
//	public Employee() {
//		this.name ="sample";
//	}

	
	public Employee(int id, String name, int age, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}

	public Employee() {
		super();
		this.name = "sample";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	//parameterized constructor (fully parameterized constructor)
//	Employee(int id, String name, int age, String email, long mobile) {
//		this.id=id;
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.mobile = mobile;
//	}
	
	

}
