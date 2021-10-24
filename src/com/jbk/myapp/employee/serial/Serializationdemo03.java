package com.jbk.myapp.employee.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializationdemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		
		
		e.name ="ajay";
		e.adress="nanded";
		e.password=102.05;
		
		try{
			
		FileOutputStream fileout = new FileOutputStream("abc.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(e);
		out.close();
		fileout.close();
		System.out.println("serialized data is saved");
		
		}
		
		catch (Exception i){
		i.printStackTrace();
		}
		
		
		
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
