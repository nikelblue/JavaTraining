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
		MarathonRunner monkey = new MarathonRunner("Monkey");
		MarathonRunner cupcake = new MarathonRunner("Cupcake");

		monkey.start(); //Monkey starts to run
		cupcake.start(); //Cupcake starts to run at the same time.

		//TODO:
		//After both threads 'monkey' and 'cupcake'finish, output to the console who is the winer

		//HINT:
		//monkey.join() stops the execution of the current thread until 'monkey'
		//thread finishes it's execution
		monkey.join();
		cupcake.join();

		long monkeyFinishTime = monkey.getFinishTime();
		long cupcakeFinishTime = cupcake.getFinishTime();

		if(monkeyFinishTime<cupcakeFinishTime){
			System.out.println("The winner is "+monkey.getName());
		}else if(monkeyFinishTime==cupcakeFinishTime){
			System.out.println("Tie!!");
		}else {
			System.out.println("The winner is "+cupcake.getName());
		}


		System.exit(0); //This forces application to exit killing all running threads
	}
}
