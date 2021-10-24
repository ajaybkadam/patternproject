package com.demoonoverriding;

public class Overriding {

	
	protected String val;
	void display (String str){
		
		val ="Base Class Funtion".concat(str);
		
		System.out.println(val);
	}
	
}



class SubClass extends Overriding{
	
	
	void dispay (String str){ 
		
	
str ="Derived Class Funtion".concat(str);
	
	System.out.println(str);
	
	
	
	
	
	
	
	
	
	}
	
	
}
