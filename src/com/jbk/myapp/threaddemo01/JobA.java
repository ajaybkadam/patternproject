package com.jbk.myapp.threaddemo01;

public class JobA extends Thread {
	
	
	@Override
	
	public void run(){
		
		while(true){
			System.out.println("hooooo");
		try{
			
			Thread.currentThread().sleep(1000);
			
		}catch (InterruptedException e){
			
			e.printStackTrace();
		}
		System.out.println("hello");
		}
		
	}
	

  
	
}
