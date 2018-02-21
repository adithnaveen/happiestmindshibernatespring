package com.hm.annotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	@Id
	@GeneratedValue
	private int perDetId; 
	private String pinCode; 
	private String job;
	
	public int getPerDetId() {
		return perDetId;
	}
	public void setPerDetId(int perDetId) {
		this.perDetId = perDetId;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	} 
	
	
}
