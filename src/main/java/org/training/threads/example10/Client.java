package org.training.threads.example10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author nikelblue
 *
 */
class Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	private static final int NUM_REQUESTS = 10;
	
	//TODO: 1) Run the code as it is and analyze the performance of making calls to
	//         SingleThreadedServer
	public static void main(String[] args) {
		Server server = new SingleThreadedServer();
		//TODO: 2) In order to improve execution time performance comment the line above
		//		   and uncomment the line below (use MultiThreadedServer).
		//		3) MultiThreadedServer is not implemented yet. Implement it!
		//Server server = new MultiThreadedServer();

		long start  = System.currentTimeMillis();
		for (int i = 1; i <= NUM_REQUESTS; i++) {
			server.call("deleteEntry(" + i + ")");
		}
		double duration = (System.currentTimeMillis() - start) / 1000.;
		LOGGER.debug(String.format("Duration: %.2f seconds", Double.valueOf(duration)));
	}

}
