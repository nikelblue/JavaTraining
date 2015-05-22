package org.training.threads.example07;

import java.util.Random;

abstract class Philosopher extends Thread{
	private Random r = new Random();

	public Philosopher(String name) {
		super(name);
	}
	
	protected void meditate() {
		try {
			sleep(r.nextInt(500) + 500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
