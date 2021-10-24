package com.jbk.myapp.demo.collectiondemos.q4;

public class Student implements Comparable<Student> {
	public static final String System = null;
	int id;
	String name;
	float percentage;
	
	
	
	public Student (int id, String name, float percentage){
	
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
	
	}
		
	
		
	

@Override

public String toString(){
	
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
			
	
			
			
			
}





@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	
	if (this.id > o.id)
		return 1 ;
	else
	if (this.id < o.id)
		return -1;
	else
		return 0;
	
	
	
	
	
	
}			
	
}

		
	
	
	

	


