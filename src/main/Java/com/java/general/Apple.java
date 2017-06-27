package com.java.general;

public enum Apple {
	Jonathan (100),  // using the parameterized constructor.
	GoldenDel(80),
	RedDel, Winesap, Cortland; // using the non parameterized constructor.
	
	private int price;
	
	Apple(int price){
		this.price = price;
	}
	
	Apple(){
		this.price = 50;
	}
	public int getPrice() {
		return price;
	}
	
}
