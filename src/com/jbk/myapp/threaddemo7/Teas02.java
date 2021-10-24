package com.jbk.myapp.threaddemo7;

public class Teas02 {

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
		
		
	//// when we have t1 and t2 we must use synchronizer as we use in teat03 if not use and result will differ 
		// we use synchronizer in test03 in counter.java class  only for test03 class it will come fix value 2500
		
		
	}

}
