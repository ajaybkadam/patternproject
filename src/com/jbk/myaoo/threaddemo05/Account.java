package com.jbk.myaoo.threaddemo05;

public class Account {

	int balance = 5000;
	
	
	synchronized void m1(){
		
		
		for(int i=1;i<=3;i++)
		System.out.println(balance);
		
		balance=balance-1000;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  "+balance);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
