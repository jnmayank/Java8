package com.java8.Interface;

public interface Interface1 {
	void run();
	void stop();
	default void flying() {
		System.out.println("flying..");
	}
	
	default void flyin1g() {
		System.out.println("flying..");
	}

}
