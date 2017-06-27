package com.java.general;



import java.util.StringJoiner;

public class Test {
	
	public static void main(String args[]){
		
		// StringJoiner class demo newly added in java 8.
		StringJoiner sj = new StringJoiner(",");
		sj.add("test");
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner(",","[","]");
		sj2.setEmptyValue("empty");
		System.out.println(sj2);
		
		sj2.add("test2");
		System.out.println(sj2);
		
		sj.merge(sj2);
		System.out.println(sj);
		
		DAY day;
		day = DAY.FRIDAY;
		
		switch(day){
		case MONDAY:
			System.out.println("monday");
			break;
	
		case FRIDAY:
			System.out.println("monday");
			break;
		
		case WEDNESDAY:
			System.out.println("monday");
			break;
		}	
		
		
		DAY dayes[] = DAY.values();
		for(DAY day1 : dayes){
			System.out.println(day1);
		}
		
		DAY tt = DAY.valueOf("FRIDAY"); // this is case sensitive. Must be same as enum contants.
		
		System.out.println(tt);
		
		System.out.println(Apple.GoldenDel.getPrice());
		
		System.out.println(Apple.GoldenDel.name());
		
		System.out.println(Apple.Cortland.ordinal());
		
		// Returning a positive value 
		//(Difference of both constants ordinal: 4-1 = 3) as Cortland > Cortland 
		System.out.println(Apple.Cortland.compareTo(Apple.GoldenDel)); 
	}

}


