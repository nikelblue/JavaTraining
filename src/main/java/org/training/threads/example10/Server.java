package org.training.threads.example10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class Server {
	private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

	abstract public void call(String request); 
	
	protected void doSlowProcessing() {
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
