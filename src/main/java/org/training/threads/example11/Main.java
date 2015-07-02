package org.training.threads.example11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Counter counter= new Counter();
		LOGGER.debug("Counter initialized with value: {}", Long.valueOf(counter.get()));

		LOGGER.debug("Starting incrementer threads...");
		for (int i = 0; i < 10; i++) {
			Thread thread = new IncrementerThread("Incrementer-" + i, counter);
			thread.start();
		}
	}

}
