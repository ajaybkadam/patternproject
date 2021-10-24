package com.jbk.myapp.threaddemo08;

import com.jbk.myapp.threaddemo7.A;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	

	     A obj = new A();
		
		Thread t1 = new Thread (obj);
	    t1.setName("t1");
		t1.start();
		
		Thread t2 = new Thread(obj);
		
		t2.setName("t2");
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println(obj.counter1);
		System.out.println(obj.counter2);
		
		
		System.out.println("Exit from the main");
		
		
		
		
	}

}
