package com.jbk.myapp.threaddemo7;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		A obj = new A();
		
		Thread t1 = new Thread (obj);
		
		t1.start();
		t1.join();
		System.out.println(obj.counter.i);
		
		System.out.println("Exit from the main");
		
		
		// HERE we  use join and if dont use join here result will another
		// here we not use synchronizer because there is only t1
		// when we have t1 and t2 we must use synchronizer as we use in teat03
	}

}
