package com.jbk.myapp.threadoddevendemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EVEN t1	= new EVEN();
	ODD t2 = new ODD ();
	
	t1.setPriority(1);
	t2.setPriority(5);
	System.out.println("MAX"+Thread.MAX_PRIORITY);
	System.out.println("MIN"+Thread.MIN_PRIORITY);
	System.out.println("NORMAL"+Thread.NORM_PRIORITY);
	
	
	
	
	
	t1.start();
	t2.start();
	
	
	
	
		
		System.out.println("MY NAME IS AJAY");
	}

}
