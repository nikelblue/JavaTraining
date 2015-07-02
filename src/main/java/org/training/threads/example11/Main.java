package org.training.threads.example11;

class Main {

	public static void main(String[] args) {
		Counter counter= new Counter();
		for (int i = 0; i < 50; i++) {
			Thread thread = new IncrementerThread("Incrementer-" + i, counter);
			thread.start();
		}
	}

}
