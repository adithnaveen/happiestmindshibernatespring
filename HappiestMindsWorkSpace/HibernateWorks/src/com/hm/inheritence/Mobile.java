package com.hm.inheritence;

public class Mobile extends Product{
	
	private String type; // smart or featured 
	private String os;   // android, windows, apple 
	private String connectivity; // gsm, cdma 


	public Mobile(int productId, String productName, String productDesc, double productPrice, 
			String type, String os, String connectivity) {
		
		super(productId, productName, productDesc, productPrice);
		this.type = type; 
		this.os = os; 
		this.connectivity = connectivity;
	}






	@Override
	public String toString() {
		return "Mobile [type=" + type + ", os=" + os + ", connectivity=" + connectivity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	
	
}