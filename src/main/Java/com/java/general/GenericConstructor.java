package com.java.general;

public class GenericConstructor {
	
	private Double value;
	
	<T extends Number>GenericConstructor(T t){
		value = t.doubleValue();
		
	}
	
	public static void main(String args[]){
		GenericConstructor gc = new <Integer>GenericConstructor(123); 	// without the type Inference.
		
		GenericConstructor gc1 = new GenericConstructor(123);			// with the type Inference.
	}

}
