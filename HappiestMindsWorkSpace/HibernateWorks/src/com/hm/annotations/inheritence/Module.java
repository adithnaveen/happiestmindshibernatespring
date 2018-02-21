package com.hm.annotations.inheritence;

import javax.persistence.Entity;

@Entity
public class Module extends Task {
	private String modName;

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	} 
}
