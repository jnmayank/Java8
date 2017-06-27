package com.java8.Impl;

import com.java8.Interface.Interface1;
import com.java8.Interface.Interface4;

public class Car3 implements Interface1,Interface4{
	@Override
	public void run() {
	}
	@Override
	public void stop() {	
	}
	@Override
	public void flying() {
		System.out.println("flying from implemrnting class..");
		
	}

}
