package com.jbl.myapp.collectiondemocomparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestdemoOfcomaparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<ComparableDemo> al =new ArrayList<>();
	
	al.add(new ComparableDemo(101,"ajay",26));
	al.add(new ComparableDemo(106,"vikram",30));
	al.add(new ComparableDemo(105,"amol",32));
	
	Collections.sort(al);
	
	for(ComparableDemo st:al){
	
	
	
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
