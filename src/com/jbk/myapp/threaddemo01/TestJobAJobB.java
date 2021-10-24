package com.jbk.myapp.threaddemo01;

public class TestJobAJobB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JobA t1 = new JobA();
		JobB t2 = new JobB();
		
		t1.start();
		t2.start();
	}

}
