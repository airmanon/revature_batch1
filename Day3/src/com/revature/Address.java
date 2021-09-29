package com.revature;

public class Address {

	private int doorNo;
	private String streetName;
	private String city, zipcode, state;
	private String country;

	public Address() {
		super();
	}

	public Address(int doorNo, String streetName, String city, String zipcode, String state, String country) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
