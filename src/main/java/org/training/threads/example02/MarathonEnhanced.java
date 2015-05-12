/**
 * 
 */
package org.training.threads.example02;

/**
 * @author nikelblue
 *
 */
class MarathonEnhanced {
	public static void main(String[] args) throws Exception {
		//We instantiate two participants to the marathon
		Thread monkey = new MarathonRunner("Monkey");
		Thread cupcake = new MarathonRunner("Cupcake");

		monkey.start(); //Monkey starts to run
		cupcake.start(); //Cupcake starts to run at the same time.

		//TODO:
		//After both threads 'monkey' and 'cupcake', output to the console who is the winer
		
		//HINT:
		//monkey.join() stops the execution of the current thread until 'monkey'
		//thread finishes it's execution

		System.exit(0); //This forces application to exit killing all running threads
	}
}
