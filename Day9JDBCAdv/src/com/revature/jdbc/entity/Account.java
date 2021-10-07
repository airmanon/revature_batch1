package com.revature.jdbc.entity;

public class Account {

	private int id;
	private String accountType;
	private int employeeId;

	public Account() {
		super();
	}

	public Account(int id, String accountType, int employeeId) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.employeeId = employeeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", employeeId=" + employeeId + "]";
	}

}
