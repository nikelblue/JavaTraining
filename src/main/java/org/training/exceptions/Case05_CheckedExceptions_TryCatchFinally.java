/**
 * 
 */
package org.training.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DanielB
 *
 * @see http://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html
 * @see http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
 */
public class Case05_CheckedExceptions_TryCatchFinally {
	private static Logger LOGGER = LoggerFactory.getLogger(Case05_CheckedExceptions_TryCatchFinally.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Trying to execute: anotherMethod");

		// Because methodWhichFails reports a checked exceptions, when we call that method, 
		// we are forced either to catch the exception an treat it (try... catch... block)
		// either to report that exception as well with 'throws' keyword.
		// 
		// In our case we catch and treat the exception.
		try {
			anotherMethod();
			LOGGER.info("This message should not be printed out");
		}
		//and in case something gets wrong, we catch the exception object thrown
		//by methodWhichFails and we treat it as we like. In this case we simple
		//show a message and and then print exception details.
		catch (Exception e) {
			//Show a message and print exception details
			LOGGER.error("We cought a checked exception. Check exception details:", e);
		}
		finally {
			//There are situations when no matter what happens we need to be sure a piece of code 
			//will be executed. 'finally' block ensures that.
			//
			//A very common example of this situation is:
			//We open a file for writing which means nobody else can open it anymore
			//until we close it. If something get's wrong we need to be sure the
			//file will be closed otherwise the access to the file will be blocked forever.
			//We close the file always in a finally block. We will see that in another example.
			LOGGER.info("This code is executed no mater what");
		}

	}

	/**
	 * Because methodWhichFails reports a checked exceptions, when we call that method, 
	 * we are forced either to catch the exception an treat it (try... catch... block)
	 * either to report that exception as well with 'throws' keyword.
	 * 
	 * In our case we re-thrown it
	 *  
	 * @throws Exception
	 */
	public static void anotherMethod() throws Exception {
		LOGGER.info("Trying to execute: methodWhichFails");
		//here we don't care about anything that might get wrong. 
		//If something gets wrong, the exception will be re-thrown to this method caller.
		methodWhichFails();
		LOGGER.info("This message should not be printed out");
	}

	/**
	 * This method throws a checked exception. Compared to runtime exceptions,
	 * the checked exceptions have to be reported to the callers with the
	 * 'throws' keyword.
	 * @throws Exception
	 */
	public static void methodWhichFails() throws Exception {
		LOGGER.info("START");

		//We throw this runtime exception. After we throw this 
		//exception the program execution will be stopped. Nothing else
		//after will be executed
		throw new Exception("Ups. Something got wrong!!!");
	}

}
