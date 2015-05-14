/**
 * 
 */
package org.training.threads.example02;

import java.util.Random;

/**
 * @author DanielB
 *
 */
public class MarathonRunner extends Thread {
	private long finishTime;

	public long getFinishTime(){
		return this.finishTime;
	}


	//We want to give a name to the thread so we can easily identify it
	public MarathonRunner(String name) {
		super(name);
	}

	//This is the magic method we need to override. The logic inside will be executed by thread
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			//print a message
			System.out.printf("%-20s ran %2dKm\n", getName(), Integer.valueOf(i));
			//and sleep a while (keep running)
			sleepAWhile(r);		
		}
		finishTime = System.currentTimeMillis();
		System.out.printf("%-20s finished the marathon\n", getName());
	}

	private void sleepAWhile(Random r) {

		try {
			//We wait until this runner runs another KM. Depending on how tired is it
			//then one KM can be finished faster or slower.
			//(We let the current thread sleep between 0.5 and 1.5seconds randomly)
			Thread.sleep(r.nextInt(1000) + 500);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
