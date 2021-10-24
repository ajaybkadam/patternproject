package com.jbk.myapp.demo.collectiondemos.q4;

import java.util.Comparator;

public class Studentpercentagecomparator implements Comparator<Student> {



	@Override
	public int compare(Student o1, Student o2) {
		
		// TODO Auto-generated method stub
		Float n1 = o1. percentage;
		Float n2 = o2. percentage;
		
		return n1.compareTo(n2);
		
		
		
		
		
	}

}
