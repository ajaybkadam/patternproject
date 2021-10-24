package com.jbk.myapp.demo.collectiondemos.q4;

import java.util.ArrayList;

import java.util.Collections;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1 = new Student(101,"shilpa",78);
		Student s2 = new Student(77,"saurabh",69);
		Student s3 = new Student(167,"geeta",69);
		Student s4 = new Student(169,"nishant",43);
		
		ArrayList<Student> studlist = new ArrayList<Student>();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		
		Studentidcomparator idc = new Studentidcomparator();
		Studentnamecomparator nam = new Studentnamecomparator();
		Studentpercentagecomparator percen = new Studentpercentagecomparator();
		
		
			 //Collections.sort(studlist,idc);
			 
			 
			//for(Student t:studlist )
			
				//System.out.println(t);
			     
			// studlist.forEach(s->System.out.println(s));
			// System.out.println("===========================================");
			// Collections.sort(studlist,nam);
			// studlist.forEach(s->System.out.println(s));
	        // System.out.println("=============================================");
	         //Collections.sort(studlist, percen);
	         //studlist.forEach(s->System.out.println(s));
	         //System.out.println("=================================================");
	         
	         
	         
	         
	         //for default collection thats why we take student class implements comparable<student>
	         //and take comparable if (this.id>o.id)
	                             //  return 1; and so on
	         //the purpose of taking default collection is take sorting
	         
	        // Collections.sort(studlist);
	       // studlist.forEach(s->System.out.println(s));
			 
			 
			 
	        ArrayList<Student> t = (ArrayList<Student>)studlist.stream().filter(s->s.id>100 && s.percentage>=60).collect(Collectors.toList());
	        
	         
				 t.forEach(s->System.out.println(s));
				 
				 
	}

}
