package com.jbk.myaoo.threaddemo05;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Account account1 = new Account();
		
		Job obj = new Job(account1);
		
		Thread t1 =new Thread(obj);
		t1.setName("t1;");
		t1.start();
		t1.join();
		
		
	    Thread t2 =new Thread(obj);
	    t2.setName("t2;");
		t2.start();
		t2.join();
		
		
		
	    Thread t3 =new Thread(obj);
	    t3.setName("t3;");
		t3.start();
		t3.join();
		
			
	System.out.println("FINAL VALUE:"+account1.balance);	
		
		
	}

}
