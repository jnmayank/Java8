package com.java.clone;

public class clonee implements Cloneable {
	
	Day day;
	public void init(){
		day = Day.MONDAY;
		day.setWorkingStatus("non");
		System.out.println(day.getWorkingStatus());
	}
	
 public static void main(String args[]) throws CloneNotSupportedException{
	 clonee e = new clonee();
	 e.init();
 }
}
