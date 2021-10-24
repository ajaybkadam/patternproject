package com.jbk.myapp.threaddemo01;

public class JobB extends Thread {
	
	
	public void run(){
		
		for(int i=0;i<=5;i++){
			System.out.println(i);
		
			try{
				
				Thread.currentThread().sleep(1000);
				
			}catch (InterruptedException e){
				
				e.printStackTrace();
			}
			System.out.println("job b is finished");
			}
	}
	

}
