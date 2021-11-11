package com.revature.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "min_balance")
	private int minBalance;
	@Column(name = "interest_rate")
	private float interestRate;

	public Account() {
		super();
	}

	public Account(int id, String accountType, int minBalance, float interestRate) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.minBalance = minBalance;
		this.interestRate = interestRate;
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

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

}
