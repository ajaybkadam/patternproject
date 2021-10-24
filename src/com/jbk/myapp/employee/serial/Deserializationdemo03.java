package com.jbk.myapp.employee.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserializationdemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = null;
		
		
		try{
			
		FileInputStream filein = new FileInputStream("abc.txt");
		ObjectInputStream in = new ObjectInputStream(filein);
		
		e =(Employee) in.readObject();
		in.close();
		filein.close();
		}catch (IOException i){
			
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c){
			
			System.out.println("Emloyee class not found");
			c.printStackTrace();
			return;
			
		}
		
		System.out.println("deserialized employee");
		System.out.println("name: "+ e.name);
		System.out.println("adress :" + e.adress);
		System.out.println("password:" + e.password);
		
	}
		
		
}	
		
		
		
		
		
		
		
		