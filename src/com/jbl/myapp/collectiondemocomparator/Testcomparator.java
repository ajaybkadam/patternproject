package com.jbl.myapp.collectiondemocomparator;

import java.util.ArrayList;
import java.util.Collections;

import com.jbk.myapp.demo.collectiondemos.q4.Studentnamecomparator;

public class Testcomparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student (101,"vijay",23));
		al.add(new Student (106,"ajay",27));
		al.add(new Student (105,"jaiy",21));
		
		
		System.out.println("Sorting by name");
		Collections.sort(al,new Namecomparator());
		
		for(Student st:al){
			
			System.out.println(st.rollno+" "+st.name+""+st.age);
		}
		System.out.println("sorting bye age");
		Collections.sort(al,new Agecomparator());
		for(Student st:al){
			
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
