package com.jbl.myapp.serializationdemo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		Student s1 = new Student(11,"aj","1245555");
		FileOutputStream fos = new FileOutputStream("YASH.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("YASH.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
	    Student s =(Student)obj;
		System.out.println(s);
		fis.close();
		ois.close();
		
				

		
	
		
		
		
	}

}
