package org.training.threads.example06;

public class TennisPlayer2 extends Player {

	public TennisPlayer2(String name, Object ball) {
		super(name, ball);
	}

	@Override
	public void run() {
		for(;;) {
			try {
				reachTheBall(); 

				synchronized(ball) {
					System.out.println(getName() + ": ping");
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
