package com.revature.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
//@Inheritance(strategy=InheritanceType.JOINED)
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "door_no")
	private String doorNo;
	@Column(name = "street_name")
	private String streetName;
	private String city;
	private String state;
	private String zip;
//	@OneToOne(cascade = CascadeType.ALL)
//	Customer customer;

	public Address() {
		super();
	}

	public Address(int id, String doorNo, String streetName, String city, String state, String zip) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
