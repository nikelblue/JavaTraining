package org.training.threads.example10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author nikelblue
 *
 */
final class MultiThreadedServer extends Server{
	private static final Logger LOGGER = LoggerFactory.getLogger(MultiThreadedServer.class);

	public void call(final String request) {
		//TODO: 4) Process each request in a separate thread. In this way the Client
		//		   is not forced to wait for the previous request in order to call a new request.
		// Hint: Using of anonymous classes might simplify the code. 
		// https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
		//throw new RuntimeException("Not implemented yet!!!"); //Remove this line
		Thread reqestThread = new Thread(){
			public void run() {
				processRequest(request);
			}
		};

		reqestThread.start();
	}

	private void processRequest(String request) {
		LOGGER.debug("Request: '" + request + "' [START]");
		doSlowProcessing();
		LOGGER.debug("Request: '" + request + "' [ END ]");
	}
}
