package org.training.threads.example06;

import java.util.Random;

abstract class Player extends Thread{
	private Random r = new Random();
	
	protected final Object ball;

	public Player(String name, Object ball) {
		super(name);
		this.ball = ball;
	}
	
	protected void reachTheBall() {
		try {
			sleep(r.nextInt(500) + 500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
