package com.java8.Interface;

/**
 * 
 * @author mjain58
 *
 */
public interface Inteface3 extends Interface1 {
	
	/*//overriding the default flying method from interface1
	default void flying() {
		System.out.println("flying3...");
	}*/
	
	/*Here we redeclare the flying method in
	 * interface 3 hence make it abstract from default.
	 */
	void flying();

}
