package com.java.serialzation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization extends Parent implements Serializable{
	//private static final long serialVersionUID = 1L;
	
	int a;
	int b;
	public Serialization(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	/*private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();
		
		//notice the order of read and write should be same
		setFlag(ois.readInt());	
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		System.out.println("test");
		oos.defaultWriteObject();
		oos.writeInt(getFlag());
	}*/

}
