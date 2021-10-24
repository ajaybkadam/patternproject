package com.jbk.myapp.threaddemo08;

public class JOBA implements Runnable {

	Counter counter1 = new Counter();
	
	Counter counter2 = new Counter();
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub


		for(int i=1;i<=2500;i++)
	
			counter1.increment();
			
			counter2.increment();	
			
			
			
	}

}
