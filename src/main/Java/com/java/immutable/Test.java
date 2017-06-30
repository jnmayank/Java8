package com.java.immutable;

public class Test {
	public static void main(String args[]){
		
		
		Address addr  = new Address("vaibhav kahan", "Indirapurma", "UP");
		
		Person person = new Person("mayank",addr);
		
		addr.setCity("Ghazihabad1");
		
		person.getAddress().setCity("Ghazihabad2");
		
		System.out.println(person.getAddress().getCity());
	}

}
