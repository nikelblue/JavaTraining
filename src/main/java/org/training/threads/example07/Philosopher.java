package org.training.threads.example07;

import java.util.Random;

abstract class Philosopher extends Thread{
	private Random r = new Random();
	
	protected final Object speaker;

	public Philosopher(String name, Object speaker) {
		super(name);
		this.speaker = speaker;
	}
	
	protected void meditate() {
		try {
			sleep(r.nextInt(500) + 500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
