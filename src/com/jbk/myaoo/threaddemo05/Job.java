package com.jbk.myaoo.threaddemo05;

public class Job implements Runnable {

	
	Account account1;
	
	Job(Account account1){
		
		this.account1 = account1;
		
	}
	
	@Override
	public void run() {
		
		account1.m1();
		
		
	}
	
	
	
	
	
}
