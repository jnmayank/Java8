package com.java.immutable;

public final class Person {
	private final String name;
	private final Address address;

	
	/*Storing the reference to copy not the reference to original one passed to constructor.*/
	Person(String name , Address address){
		Address copy  = new Address(address.getLine1(), address.getCity(), address.getState());
		this.address = copy;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	/*Returning the copy not original one.*/
	public Address getAddress() {
		Address copy  = new Address(this.address.getLine1(), this.address.getCity(), this.address.getState());
		return copy;
	}
}
