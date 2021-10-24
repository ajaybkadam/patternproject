package com.jbl.myapp.serializationdemo1;

import java.beans.Transient;
import java.io.Serializable;

public class Student implements Serializable {

	transient int id;
	public String name;
	transient String password;
	public String age;
	public String location;
	
	
	 public Student(int id,String name,String password){
		 
		 
		 this.id=id;
		 this.name=name;
		  this.password=password;
	}
	
	
	@Override
	
	public String toString(){
		
		
		return "Student[id=" + id + ", name=" + name +",password=" + password +"]";
	}
	
	
	
	
	
}
