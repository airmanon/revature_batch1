package com.revature.trainingmanagement.entity;

import java.sql.Date;

public class Training {
	private int id;
	private int technologyId;
	private String name;
	private int duration;
	private Date startDate;
	private Date testDate;// (calculatedField)

	public Training() {
		super();
	}

	public Training(int id, int technologyId, String name, int duration, Date startDate, Date testDate) {
		super();
		this.id = id;
		this.technologyId = technologyId;
		this.name = name;
		this.duration = duration;
		this.startDate = startDate;
		this.testDate = testDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", technologyId=" + technologyId + ", name=" + name + ", duration=" + duration
				+ ", startDate=" + startDate + ", testDate=" + testDate + "]";
	}

}
