package com.java.general;

import java.util.Comparator;

class Gen <T>{
	T t;
	
	Gen(T t){
		this.t  = t;
	}
	T getObject(){
		return this.t;
	}
	
	public void displayType(){
		System.out.println("Type t is "+ this.t.getClass().getName());
	}

}

public class Generic{
	public static void main(String args[]){
		Gen<Integer> intGen = new Gen <>(88); //AutoBoxing
		intGen.displayType();
		
		
		String []s = {"Test"};
		
		Util.<String>countGreaterThen(s, "TEST");   // without the type Inference.
		System.out.println(Util.countGreaterThen(s, "TEST"));  			// with the type Inference.
		
	}
}
