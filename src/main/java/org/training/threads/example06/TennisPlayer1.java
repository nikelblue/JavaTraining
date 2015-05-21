package org.training.threads.example06;

public class TennisPlayer1 extends Player {

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
					System.out.println(getName() + ": pong");
					ball.notify(); //Hit the ball
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
