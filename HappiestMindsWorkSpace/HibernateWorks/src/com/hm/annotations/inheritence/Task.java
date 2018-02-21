package com.hm.annotations.inheritence;

import javax.persistence.Entity;

@Entity
public class Task extends Project{
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	} 
	
}
