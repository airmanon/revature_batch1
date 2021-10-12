package com.revature.trainingmanagement.entity;

import java.sql.Date;

public class Assessment {
	private int id;
	private int trainingId;
	private int technologyId;
	private int associateId;
	private int score;
	private Date assessmentDate;
	private String result;// (calculated field)

	public Assessment() {
		super();
	}

	public Assessment(int id, int trainingId, int technologyId, int associateId, int score, Date assessmentDate,
			String result) {
		super();
		this.id = id;
		this.trainingId = trainingId;
		this.technologyId = technologyId;
		this.associateId = associateId;
		this.score = score;
		this.assessmentDate = assessmentDate;
		this.result = result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Assessment [id=" + id + ", trainingId=" + trainingId + ", technologyId=" + technologyId
				+ ", associateId=" + associateId + ", score=" + score + ", assessmentDate=" + assessmentDate
				+ ", result=" + result + "]";
	}

}
