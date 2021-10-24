package com.jbk.myapp.deserialization;

import java.io.Serializable;

public class Student implements Serializable  {
 
	
	String name;
	int age;
	String location;
	
Student(String name,int age,String location){
	
	this.name=name;
	this.age=age;
	this.location=location;
	
	
	
}
@Override

public String toString(){
	
	
	
	return "Student[name="+name+",age="+age+",location="+location+"]";
}

	

	
}
