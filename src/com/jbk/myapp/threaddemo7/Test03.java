package com.jbk.myapp.threaddemo7;

public class Test03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		


	     A obj = new A();
		
		Thread t1 = new Thread (obj);
	
		t1.start();
		
		Thread t2 = new Thread(obj);
		t2.start();
		
	
		t1.join();
		t2.join();
		System.out.println(obj.counter.i);
		
		System.out.println("Exit from the main");
		
		
		
		// synchronizer use in counter.java class,  synchronizer void increment();
			
		
		
	}

}
