package com.java.general;

public class Util {
	
	
	// Generic Method with the Bounded Type.
	public static <T extends Comparable<T>> int countGreaterThen (T[] array1 , T Element){
		int count = 0;
		for(T e :array1){
			if(e.compareTo(Element) >1){
				count++;
			}
		}
		return count;
		
	}

}
