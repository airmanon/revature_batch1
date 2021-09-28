package com.revature.model;
//private member variable & public methods --- encapsulation (hiding the data)
public class Child extends Parent {
	private int id;
	private String name;

	public Child(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", age=" + age + ", car=" + car + ", buildings=" + buildings
				+ "]";
	}

	
}
