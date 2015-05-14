/**
 * 
 */
package org.training.threads.example03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;


/**
 * Since the first marathon edition was so successful, more and more people 
 * came to register for the second marathon edition.  
 * 
 * @author nikelblue
 *
 */
class MarathonSecondEdition {
	public static void main(String[] args) throws InterruptedException {
		
		//There are 5 participants this time. We better improve our code so more participants may be added
		//at any time without too much effort. So, let's use collections.
		Collection<MarathonRunner> registeredParticipants = new ArrayList<MarathonRunner>();
		registeredParticipants.add(new MarathonRunner("Monkey"));
		registeredParticipants.add(new MarathonRunner("Cupcake"));
		registeredParticipants.add(new MarathonRunner("Jimmy"));
		registeredParticipants.add(new MarathonRunner("Michael"));
		registeredParticipants.add(new MarathonRunner("Gary"));

		for (MarathonRunner marathonRunner : registeredParticipants) {
			marathonRunner.start();
		}
		
		for (MarathonRunner marathonRunner : registeredParticipants) {
			marathonRunner.join();
		}

		//At the end of the marathon let's print all the participants SORTED by the running time.
		//For each participant print: position, name and running time in seconds:
		//i.e. 
		//1. Monkey      10.25s
		//2. Cupcake     11.03s
		//3. Jimmy       11.12s
		
		//i.e. System.out.printf("%d. %-20s %2.2d\n",position, name, time );
		
		TreeSet<MarathonRunner> sortedParticipants = new TreeSet<MarathonRunner>(registeredParticipants);
		
		System.out.println();
		int i= 0;
		for (MarathonRunner marathonRunner : sortedParticipants) {
			System.out.printf("%d. %-20s %2.2fs\n",Integer.valueOf(++i), marathonRunner.getName(), Float.valueOf(marathonRunner.getRunningTime()/1000f));
		}
		
		System.exit(0);
		
	}
}
