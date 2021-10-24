package com.jbk.myapp.threaddemo04;

public class TestJobA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sample sample =new Sample();
		JobA obj = new JobA();
		
		Thread t1 = new Thread(obj);
		
		t1.start();
		
		t1.setName("t1:");
		

		Thread t2 = new Thread(obj);
		
		t2.start();
		
		t2.setName("t2:");
		
		 

		Thread t3 = new Thread(obj);
		
		t3.start();
		
		t3.setName("t3:");
		
		
		
		
	}

}
