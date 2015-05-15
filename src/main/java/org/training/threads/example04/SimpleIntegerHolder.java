package org.training.threads.example04;

import java.util.Random;

final class SimpleIntegerHolder implements IntegerHolder{
	private int value = 0;
	private Random r = new Random();
	
	public int incrementAndGet() {
		value++;
		performSlowOperations();
		return value;
	}
	
	
	public static void main(String[] args) {
		SimpleIntegerHolder integerHolder = new SimpleIntegerHolder();
		
		Thread t1 = new IncrementerThread(integerHolder);
		Thread t2 = new IncrementerThread(integerHolder);
		
		//We start two threads. Each of them will get the next integer value
		//and will print it out.
		t1.start();
		t2.start();
		//We expect to see the integers from 1 to 10
		
		
		//Analyze the output. What do you notice? 
		//Is any integer value missing?
		//Is any integer value duplicated?
		
		//If so, can you explain why?
	}

	
	private void performSlowOperations() {
		try {
			Thread.sleep(r.nextInt(500));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
