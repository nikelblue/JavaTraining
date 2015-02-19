/**
 * 
 */
package org.training.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DanielB
 *
 * @see http://docs.oracle.com/javase/7/docs/api/java/lang/RuntimeException.html
 * @see http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
 */
public class Case02_RuntimeExceptions_TryCatch {

	private static Logger LOGGER = LoggerFactory.getLogger(Case02_RuntimeExceptions_TryCatch.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Trying to execute: methodWhichFails");

		//with try we get prepared that something might get wrong...
		try {
			methodWhichFails();
			LOGGER.info("This message should not be printed out");
		}
		//and in case something gets wrong, we catch the exception object thrown
		//by methodWhichFails and we treat it as we like. In this case we simple
		//show a message and and then print exception details. 
		catch (RuntimeException e) {
			//Show a message and print exception details
			LOGGER.error("We cought a runtime exception:", e);
		}

	}

	public static void methodWhichFails() {
		LOGGER.info("START");

		//We throw this runtime exception. After we throw this 
		//exception the program execution will be stopped. Nothing else
		//after will be executed
		throw new RuntimeException("Ups. Something got wrong!!!");
	}

}
