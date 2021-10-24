package com.jbk.myapp.employee.serial;

import java.io.Serializable;

public class Employee implements Serializable {
	
   String name;
   String adress;
   double password;
	
	 public Employee(){
		 
		 
		 this.name=name;
		 this.adress=adress;
		  this.password=password;
	}
	
	
	@Override
	
	public String toString(){
		
		
		return "Student[name=" + name + ", adress=" +adress +",password=" + password +"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
