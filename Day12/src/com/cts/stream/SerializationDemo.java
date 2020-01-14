package com.cts.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static Object deserialize(String fileName) throws ClassNotFoundException, IOException {
		FileInputStream fin=new FileInputStream(fileName);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin=new ObjectInputStream(bin);
		Object obj=oin.readObject();
		return obj;
	}
	
	public static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fout=new FileOutputStream(fileName);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out=new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(123, "Topper Nagasri", "Arich", 25, 63008, 67000);
		
		try {
			serialize(emp,"serial.txt");
			Employee emp2=(Employee)deserialize("serial.txt");
			System.out.println(emp2);
		} catch ( ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e.getMessage());
		}
		
		
	
	}

}
