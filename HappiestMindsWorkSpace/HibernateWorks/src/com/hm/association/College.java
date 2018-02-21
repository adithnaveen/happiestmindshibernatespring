package com.hm.association;

public class College {
	private int collegeId; 
	private String collegeName; 
	private String collegeCity;

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
	
	
	
}