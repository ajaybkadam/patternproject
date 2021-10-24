package com.jbk.myapp.threaddemo7;

public class A implements Runnable{

	Counter counter = new Counter();
	public Object counter1;
	public Object counter2;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=2500;i++){
			
			counter.increment();
		}
	}

}
