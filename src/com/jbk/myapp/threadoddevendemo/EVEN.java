package com.jbk.myapp.threadoddevendemo;

public class EVEN extends Thread {

	
	public void run(){
		
		for(int i=0;i<=20;i++){
			
			if(i%2==0)
		System.out.println("even:"+i);		
			
          try{
				
				Thread.currentThread().sleep(1000);
				
			}catch (InterruptedException e){
				
				e.printStackTrace();
			}
		}
		
		
		
			
			
			
	}
}
