package com.jbl.myapp.collectiondemocomparator;

import java.util.Comparator;

public class Namecomparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}


	
	
}
