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
public class Case01_RuntimeExceptions {
	private static Logger LOGGER = LoggerFactory.getLogger(Case01_RuntimeExceptions.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Trying to execute: methodWhichFails");
		methodWhichFails();
		LOGGER.info("This message should not be printed out");
	}

	public static void methodWhichFails() {
		LOGGER.info("START");

		//We throw this runtime exception. After we throw this 
		//exception the program execution will be stopped. Nothing else
		//after will be executed
		throw new RuntimeException("Ups. Something got wrong!!!");
	}

}
