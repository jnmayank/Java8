package com.java.clone;

public enum Day implements Cloneable{
	SUNDAY("not"),
	MONDAY("yes"), tuesday("yes");
	
	String workingStatus;
	public String getWorkingStatus() {
		return workingStatus;
	}
	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}
	Day(String s){
		this.workingStatus = s;
	}
	
}
