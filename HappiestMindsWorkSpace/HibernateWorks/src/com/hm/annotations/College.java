package com.hm.annotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Annotationcollege")
public class College {
	
	@Id
	@GeneratedValue
	private int collegeId; 
	private String collegeName; 
	private String collegeCity;

	@ManyToOne
	@JoinColumn(name="university")
	private University university; 
	
	public College(){}
	
	public College(String collegeName, String collegeCity) {
		super();
		this.collegeName = collegeName;
		this.collegeCity = collegeCity;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCity=" + collegeCity
				+ "]";
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCity() {
		return collegeCity;
	}
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	} 
	
	
	
}