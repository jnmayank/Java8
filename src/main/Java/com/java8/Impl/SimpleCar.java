package com.java8.Impl;

import com.java8.Interface.Interface1;

public class SimpleCar implements Interface1 {

	@Override
	public void run() {
		System.out.println("running");
		
	}
	@Override
	public void stop() {
		System.out.println("stopping");
		
	}

}
