package com.java.general;

public class GenericTest <T,V> {
	T obj1;
	V obj2;
	
	void setData(T o){
		obj1 = o;
	}
	
	//Error Message: Erasure of method setData(V) is the same as another method in type GenericTest<T,V>
	/*void setData(V o){
		obj2 = o;
	}*/
	
	
	public static<N>/*static methods can use their own type parameter not the class one.*/void testt(){
		//T = null; T cannot be resolved as type parameter of class.
		
	}
}
