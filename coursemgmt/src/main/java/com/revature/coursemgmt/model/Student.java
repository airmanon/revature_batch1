package com.revature.coursemgmt.model;

public class Student {

	private int id;
	private String name;
	private String email;
	private long mobile;
	private int courseId;

	public Student(int id, String name, String email, long mobile, int courseId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}

	
	public Student(String name, String email, long mobile, int courseId) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseId = courseId;
	}


	public Student() {
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

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", courseId="
				+ courseId + "]";
	}

	
}
