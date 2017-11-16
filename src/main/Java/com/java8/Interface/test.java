package com.java8.Interface;

public class test implements Interface4, Interface5 {
	public static void main(String args[]){
		System.out.println(Interface4.isNull(""));
		
		System.out.println(Interface5.isNull(""));
	}

}
