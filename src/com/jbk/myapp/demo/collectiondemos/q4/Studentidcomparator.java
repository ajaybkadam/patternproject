package com.jbk.myapp.demo.collectiondemos.q4;

import java.util.Comparator;

public class Studentidcomparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		 Integer i1 = o1.id;
		 Integer i2 = o2.id;
		
		
		return i1.compareTo(i2);
	}

}
