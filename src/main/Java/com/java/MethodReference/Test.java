package com.java.MethodReference;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Test {
	
	 private static List<Double> findSquareRoot(List<Integer> list, Function<Integer,Integer> f){
		 List<Double> result = new ArrayList<Double>();
		 list.forEach(x -> result.add(Math.sqrt(f.apply((Integer) x))));
		 return result;
		 }
	 
	 
	public static void main(String args[]){
		
		List numbers = Arrays.asList(4,9,16,25,36);
		List squaredNumbers = Test.findSquareRoot(numbers, x -> new Integer(x)); // passing lambda expression as method argument.
		List squaredNumbers1= Test.findSquareRoot(numbers,Integer::new); // Constructor reference.
		
		
		ArrayList<Person> personlist = new ArrayList<Person>();
		
		String a1  = "ee11";
		
		a1.toUpperCase();
		
		personlist.add(new Person(
	            "George",
	            IsoChronology.INSTANCE.date(1991, 8, 13),
	            Person.Sex.MALE, "george@example.com"));
		
		
		personlist.add(new Person("Mayank",
	            IsoChronology.INSTANCE.date(1989, 7, 12),
	            Person.Sex.MALE,
	            "fred@example.com"));
		
		personlist.add(new Person(
            "Jany",
            IsoChronology.INSTANCE.date(1990, 7, 15),
            Person.Sex.FEMALE, "jane@example.com"));
		
		
		
		/* simple lambda expression.*/
		
		//Collections.sort(personlist, (a,b)-> a.birthday.compareTo(b.birthday)); 
		
		/*Lambda expression calling a existing compareByAge() method as this method is compatible with the
		compare method of comparator interface.*/
		
		//Collections.sort(personlist, (a,b)-> Person.compareByAge(a, b));
		
		/*Using static method reference Method in place of lambda expression. calling a existing compareByAge() method as this method is compatible with the
		compare method of comparator interface.*/
		//Collections.sort(personlist,Person::compareByAge); 
		
		
		/*for(Person a : personlist){
			System.out.println(a.toString());
		}*/
		
		/*Using Instance method reference Method in place of lambda expression. calling a existing compareByName() method as this method is compatible with the
		compare method of comparator interface.*/
		Collections.sort(personlist,new ComparisonProvider()::compareByName); 
		
		for(Person a : personlist){
			System.out.println(a.toString());
		}
		System.out.println("persons with the gender as MALE.");
		Person.printPerson(personlist, p -> p.gender == Person.Sex.MALE);
		
	}
	
	

}
