package com.hm.autowire;

import org.springframework.stereotype.Component;

@Component
public class Screen {
	private String glassType; 
	private int length; 
	private int breadth;
	
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	} 
	
	
	
}
