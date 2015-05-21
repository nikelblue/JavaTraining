package org.training.threads.example06;

final class Main {

	public static void main(String[] args) {
		Object ball = new Object();
		
		TennisPlayer1 player1 = new TennisPlayer1("Lolek", ball);
		TennisPlayer2 player2 = new TennisPlayer2("Bolek", ball);
		
		player1.start();
		player2.start();
	}

}
