package com.jbl.myapp.collectiondemocomparator;

import java.util.Comparator;

public class Agecomparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
	if(s1.age==s2.age)	
		
		return 0;	
		
	else if(s1.age>s2.age)
		return 1;
	
	
	else
		
		
		return -1;
	}

}
