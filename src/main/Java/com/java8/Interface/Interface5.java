package com.java8.Interface;

/**
 * Static Method.
 * 
 * @author mjain58
 *
 */
public interface Interface5 {
	static boolean isNull(String str){
		return str == null?true:false;
	}
	
	default void printStr(String str){
		if(!isNull(str)){
			System.out.println(str+"not null");
		}
		else
			System.out.println("str is null");
	}
}
