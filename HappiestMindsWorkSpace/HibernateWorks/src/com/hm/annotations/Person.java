package com.hm.annotations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Person {
	@Id
	@GeneratedValue
	private int pId; 
	private String pName; 
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pDetailFk")
	private PersonDetails pDetail;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public PersonDetails getpDetail() {
		return pDetail;
	}

	public void setpDetail(PersonDetails pDetail) {
		this.pDetail = pDetail;
	} 
	
	
}
