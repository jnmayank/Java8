package com.java.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class runtime {
	
	String s;
	protected int d;
	
	public double sl;
	
	private runtime(){
		System.out.println("private A Constructor");
	}
	public void set(){
		System.out.println("i am A");
	}

}


public class A{
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<runtime> r = (Class<runtime>) Class.forName("com.java.general.runtime");
		
		
		r.getClasses();
		
		r.getFields();
		r.getDeclaredFields();
		
		
		
		Method[] m = r.getMethods();
		
		for(Method ms : m){
			System.out.println(ms.getName());
		}
		
		@SuppressWarnings("rawtypes")
		Constructor[] c =r.getDeclaredConstructors();
		for(@SuppressWarnings("rawtypes") Constructor cs : c){
			cs.setAccessible(true);
			System.out.println(cs.newInstance());
			
		}
		
		
	}
}
