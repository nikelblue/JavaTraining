package org.training.threads.example10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author nikelblue
 *
 */
final class SingleThreadedServer extends Server{
	private static final Logger LOGGER = LoggerFactory.getLogger(SingleThreadedServer.class);

	public void call(String request) {
		processRequest(request);
	}

	private void processRequest(String request) {
		LOGGER.debug("Request: '" + request + "' [START]");
		doSlowProcessing();
		LOGGER.debug("Request: '" + request + "' [ END ]");
	}
}
