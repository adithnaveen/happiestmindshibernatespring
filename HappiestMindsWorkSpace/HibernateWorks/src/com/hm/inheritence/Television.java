package com.hm.inheritence;

public class Television extends Product {
	private int size;  /// inches 
	private String screenType; // led, lcd, crt 
	private String resolution;  // 1024x846
	
	
	public Television(int productId, String productName, String productDesc,
			double productPrice, int size, String screenType, String resolution) {
		super(productId, productName, productDesc, productPrice);
			this.size = size; 
			this.screenType = screenType; 
			this.resolution = resolution;
		}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "Television [size=" + size + ", screenType=" + screenType + ", resolution=" + resolution + "]";
	}


	
	
	
}
