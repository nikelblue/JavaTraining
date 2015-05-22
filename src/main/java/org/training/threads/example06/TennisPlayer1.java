package org.training.threads.example06;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TennisPlayer1 extends Player {
	private static final Logger LOGGER = LoggerFactory.getLogger(TennisPlayer1.class);
	
	public TennisPlayer1(String name, Object ball) {
		super(name, ball);
	}


	@Override
	public void run() {
		for(;;) {
			try {
				synchronized(ball) {
					ball.wait(); //waiting for the ball
				}
				//Ball arrived. Go to catch it
				reachTheBall();
				synchronized(ball) {
					LOGGER.info("pong");
					ball.notify(); //Hit the ball
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
