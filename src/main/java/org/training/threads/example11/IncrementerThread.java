package org.training.threads.example11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class IncrementerThread extends Thread {
	Logger LOGGER = LoggerFactory.getLogger(IncrementerThread.class);
	private final Counter counter;
	
	public IncrementerThread(String name, Counter counter) {
		super(name);
		this.counter = counter;
	}

	public void run() {
		
		long initialValue = counter.get();
		doSomething();
		counter.increment();
		long incrementedValue = counter.get();
		
		if(incrementedValue - initialValue != 1) {
			LOGGER.error("Expected {} but was {}", 
					Long.valueOf(initialValue + 1),
					Long.valueOf(incrementedValue));
		}
	};
	
	private void doSomething() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}
