package org.training.threads.example06;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TennisPlayer2 extends Player {
	private static final Logger LOGGER = LoggerFactory.getLogger(TennisPlayer2.class);

	public TennisPlayer2(String name, Object ball) {
		super(name, ball);
	}

	@Override
	public void run() {
		for(;;) {
			try {
				reachTheBall(); 

				synchronized(ball) {
					LOGGER.info("ping");
					ball.notify(); //hit the ball
				}
				synchronized(ball) {
					ball.wait(); //wait for the ball to return
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}
