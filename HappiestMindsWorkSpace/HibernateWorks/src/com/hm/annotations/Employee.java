package com.hm.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="AEmployee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	
	@Column(name="emp_name", nullable=false, length=20)
	private String empName; 
	
	private double empSal;

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
	
}
