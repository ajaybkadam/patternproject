package com.jbk.myapp.deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jbk.myapp.employee.serial.Employee;
import com.jbl.myapp.serializationdemo1.Student;

public class Test {



	private static Object s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student e = new Student(32,"ajay","pune");
		
		
		e.name ="ajay";
		e.age="32";
		e.location="pune";
		
		
		
try{

	
	
	FileOutputStream fos = new FileOutputStream("YASH.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(s);
	oos.close();
	fos.close();
    
	
	
	
	FileInputStream fis = new FileInputStream("ajay.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Object obj = ois.readObject();
    Student s =(Student)obj;

	System.out.println(s);
	fis.close();
	ois.close();
	
    
    
 
}
catch(Exception e1){
	e1.printStackTrace();
	
	
	
	
	
}
		
		
	
		
		
	}

}
