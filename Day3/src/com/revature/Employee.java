package com.revature;

public class Employee {

	private int id;
	private String name;
//	@Autowired
	private Address homeAddress;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.homeAddress = homeAddress;
	}

	public Employee() {
		super();
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

}
