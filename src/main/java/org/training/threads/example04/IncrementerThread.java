package org.training.threads.example04;


final class IncrementerThread extends Thread {
	private IntegerHolder integerHolder;

	public IncrementerThread(IntegerHolder integerHolder) {
		this.integerHolder = integerHolder;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//Increment the integer value and prints it out.
			System.out.println(getName() + ": Next counter value: " + integerHolder.incrementAndGet());
		}
	}

}
