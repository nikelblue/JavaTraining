package org.training.threads.example07;

final class PhilosophersMain {

	/**
	 * TODO: Execute this code several times. Notice that the dialogue
	 * is not always fluent. Sometimes one is speaking twice.
	 * 
	 * TODO: Use a 'chopstick' to make the dialogue fluent. Use =wait() and notify() methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Student player1 = new Student("Student");
		Master player2 = new Master("Master ");
		
		player1.start();
		player2.start();
	}

}
