package com.java8.Impl;

import com.java8.Interface.Interface2;

public class Car implements Interface2{

	@Override
	public void run() {
		System.out.println("running the car");
	}

	@Override
	public void stop() {
		System.out.println("stooping the car");
	}

	@Override
	public void slowDown() {
		System.out.println("slowing down the car");
	}
	

}
