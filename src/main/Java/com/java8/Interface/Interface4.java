package com.java8.Interface;

public interface Interface4 {
	
	static boolean isNull(String str){
		return str == null?true:false;
	}
	
	default void flying(){
		System.out.println("flying4..");
	}

}
