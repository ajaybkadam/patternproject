package com.jbk.myapp.threaddemo04;

public class JobA implements Runnable{

		
	
	@Override
	
	 public void run() {
		// TODO Auto-generated method stub
	
	for(int i=0;i<=50;i++) {
		Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		

	
	
	System.out.println(	Thread.currentThread().getName());
			
		
		
	
		
		
	}

}
