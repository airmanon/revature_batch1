package com.revature.trainingmanagement.entity;

public class Technology {
	private int id;
	private String name;
	private String category;

	public Technology() {
		super();
	}

	public Technology(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Technology [id=" + id + ", name=" + name + ", category=" + category + "]";
	}

}
