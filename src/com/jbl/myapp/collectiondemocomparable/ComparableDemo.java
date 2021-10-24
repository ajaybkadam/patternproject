
 
package com.jbl.myapp.collectiondemocomparable;


public class ComparableDemo implements Comparable<ComparableDemo> {
	
	int rollno;
	String name;
	int age;
	ComparableDemo(int rollno,String name,int age){
		
		
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(ComparableDemo st){
		
		if(age==st.age)
		return 0;
		
		else if (age<st.age)
			return 1;
		
		else 
			return -1;
		
		
		
		
		
	}
	

}
