/**
 * 
 */
package org.training.threads.example03;

import java.util.Random;


/**
 * @author DanielB
 *
 */
class MarathonRunner extends Thread implements Comparable<MarathonRunner>{

	private long finishTime;
	private long startTime;
	private long runningTime;

	public long getFinishTime(){
		return this.finishTime;
	}
	
	public long getStartTime(){
		return this.startTime;
	}
	
	public long getRunningTime(){
		return this.runningTime;
	}
	//We want to give a name to the thread so we can easily identify it
	public MarathonRunner(String name) {
		super(name);
	}

	//This is the magic method we need to override. The logic inside will be executed by thread
	@Override
	public void run() {
		Random r = new Random();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			//print a message
			System.out.printf("%-20s ran %2dKm\n", getName(), Integer.valueOf(i));
			//and sleep a while (keep running)
			sleepAWhile(r);		
		}
		finishTime = System.currentTimeMillis();
		
		runningTime = finishTime - startTime;
		
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

	
	public int compareTo(MarathonRunner other) {
		int result = 0;
		
		if(other == null)
			result = 1;
		
		long finishTime = this.getFinishTime();
		long otherFinishedTime = other.getFinishTime();
		
		if(finishTime == otherFinishedTime)
			result = 0; //[null, null]
		
		if(finishTime > otherFinishedTime)
			result = 1;

		if(finishTime < otherFinishedTime)
			result = -1;
		
		return result;
	}
	@Override
	public String toString() {
		long timeInSecond = this.getFinishTime()/1000;
		
		return this.getName()+" " + timeInSecond + "s" + "\n";
	}
	
	
	}

