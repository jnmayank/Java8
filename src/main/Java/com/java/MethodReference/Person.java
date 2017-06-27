package com.java.MethodReference;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;


public class Person {
	public enum Sex {
        MALE, FEMALE
    }
	
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    
    Person(String nameArg, LocalDate birthdayArg,
            Sex genderArg, String emailArg) {
            name = nameArg;
            birthday = birthdayArg;
            gender = genderArg;
            emailAddress = emailArg;
        }  


    public int getAge() {
		return birthday
	            .until(IsoChronology.INSTANCE.dateNow())
	            .getYears();
       
    }
    
    public static int compareByAge(Person a, Person b) {   // can used as static method reference for the Comparator's compare method.
        return a.birthday.compareTo(b.birthday);
    }
    
    
    
    
    public String toString() {
        return this.name+" "+this.emailAddress+" "+this.getAge()+" "+this.gender;
    }
}
