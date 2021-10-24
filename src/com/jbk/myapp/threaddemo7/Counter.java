package com.jbk.myapp.threaddemo7;

public class Counter {

	int i = 0;
	synchronized void increment() {
		i= i+1;
	}
}
