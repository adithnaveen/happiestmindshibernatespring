package com.hm.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Master_customer")
@SecondaryTable(name="personal_customer")
public class Customer {
	@Id
	@GeneratedValue
	private int custId;
	
	@Column(name="cust_name", nullable=false)
	private String custName; 
	
	@Column(table="personal_customer")
	private double custIncome; 
	
	
	private String email; 
	@Column(table="personal_customer")
	private String insured; 
	
	@Column(table="personal_customer")
	private boolean isAlive;

	

	public Customer(){}
	
	public Customer(String custName, double custIncome, String email, String insured, boolean isAlive) {
		super();
		this.custName = custName;
		this.custIncome = custIncome;
		this.email = email;
		this.insured = insured;
		this.isAlive = isAlive;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustIncome() {
		return custIncome;
	}

	public void setCustIncome(double custIncome) {
		this.custIncome = custIncome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInsured() {
		return insured;
	}

	public void setInsured(String insured) {
		this.insured = insured;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	} 
	
	
}
