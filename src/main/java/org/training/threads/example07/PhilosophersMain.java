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
		Object speaker = new Object();
		
		Student player1 = new Student("Student", speaker);
		Master player2 = new Master("Master ", speaker);
		
		player1.start();
		player2.start();
	}

}
