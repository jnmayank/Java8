package com.java.LambdaExpression;

import java.util.Arrays;

public class LambdaTest {
	
	public static void main(String args[]){
		LambdaExpression le;
		le = () -> 123; // lambda Expression.
		System.out.println(le.getValue());
		
		le = new LambdaExpression() {	//Anonymous class.	
			@Override
			public int getValue() {
				return 1234;
			}
		};
		System.out.println(le.getValue());
		
		Interface2 checkEven;
		checkEven = (n) -> (n%2)==0;  // type of n is inferred from the iseven() method. 
									  //Example of single line lambda expression.
		Interface2 nonNeg;
		nonNeg = n -> n>0;  // Different lambda expression for same interface. omit the () as single parameter.
		
		System.out.println(checkEven.test(2));
		System.out.println(nonNeg.test(4));
		
		Interface3 isFactor;
		isFactor = (n,m) -> n%m ==0;	// two parameter lambda expression. () is mandatory here.
		System.out.println(isFactor.test(4, 2));
		
		Interface4 math;
	
		math = n -> {			// block lambda expression with return statement. 
								// Here return is mandatory. unlike single line lambda expression.
			int result = 1;
			if(n==0){
				throw new NumberFormatException();  // Throwing the Exception. Unchecked Exception.
			}
			for(int i=n;i>=1;i--){
				result = result*i;
			}
			return result;			
		};
		
		System.out.println(math.factorial(0));
		
		GenericInteface <Integer> math1 = n -> {  //generic Interface.
			int result =1;
			for(int i=n;i>=1;i--){
				result = result*i;
			}
			return result;
		};
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		System.out.println(math1.Factorial(5));
		
		
	}
	

}
