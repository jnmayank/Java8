package com.java.serialzation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {
	public static void main(String ...args){
		Serialization s = new Serialization(2, 3);
		s.setFlag(5);
		
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\JavaDemo\\test.txt"));
			os.writeObject(s);
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\JavaDemo\\test.txt"));
			Serialization si = (Serialization)in.readUnshared();

		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
