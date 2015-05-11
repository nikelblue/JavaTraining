/**
 * 
 */
package org.training.threads.example01;

/**
 * @author nikelblue
 *
 */
class Marathon {
	 public static void main(String[] args) {
		//We instantiate two participants to the marathon
		Thread monkey = new MarathonRunner("Monkey");
		Thread cupcake = new MarathonRunner("Cupcake");
		
		monkey.start(); //Monkey starts to run
		cupcake.start(); //Cupcake starts to run at the same time.
		
		//Lets watch the output to see who is the winer
	}
}
