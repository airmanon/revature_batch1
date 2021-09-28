package com.revature.model;

//Bean Class
public class Parent {

	int id;
	int age;
	String car;
	String buildings;

	public Parent() {
		super();
	}

	public Parent(int id, int age, String car, String buildings) {
		super();
		this.id = id;
		this.age = age;
		this.car = car;
		this.buildings = buildings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getBuildings() {
		return buildings;
	}

	public void setBuildings(String buildings) {
		this.buildings = buildings;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", age=" + age + ", car=" + car + ", buildings=" + buildings + "]";
	}

}
