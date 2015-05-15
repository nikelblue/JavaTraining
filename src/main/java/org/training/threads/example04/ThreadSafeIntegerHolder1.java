package org.training.threads.example04;


/**
 * 
 * @author nikelblue
 *
 */
final class ThreadSafeIntegerHolder1 implements IntegerHolder{
	private int value = 0;
		
	//In order to be sure all the operations inside this method are executed 
	//inside a thread only, we mark the method as: synchronized.
	//
	//EXPLANATION. 
	//Each Java object owns a flag which we will call it from now on 'monitor'. 
	//Therefore, each instance of ThreadSafeIntegerHolder1 will own a monitor, too.
	//If method is marked as synchronized and the method is called by Thread-1,
	//then Thread-1 will take the ownership of the 'monitor' of this ThreadSafeIntegerHolder1 
	//instance.
	//
	//If Thread-2 tries to call the same method, then Thread-2 attempts to take the 'monitor'.
	//But 'monitor' is already taken by Thread-1. So, Thread-2 waits until Thread-1 releases the 
	//'monitor'.
	//
	//When method finishes its execution and returns, then Thread-1 releases the ownership of 'monitor'.
	//Thread-2 takes now the 'monitor' ownership and can execute the method too.
	//
	//Only one thread can own a monitor at a time. 'Synchronized' forces callers to own the monitor
	//before call the method.
	public synchronized int incrementAndGet() {
		value++;
		performSlowOperations();
		return value;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadSafeIntegerHolder1 integerHolder = new ThreadSafeIntegerHolder1();
		
		Thread t1 = new IncrementerThread(integerHolder);
		Thread t2 = new IncrementerThread(integerHolder);
		
		long startTime = System.currentTimeMillis();
		
		//We start two threads. Each of them will get the next integer value
		//and will print it out.
		t1.start();
		t2.start();
		
		//Now we get the expected integer values.
		t1.join();
		t2.join();
		System.out.println("Duration (ms): " + (System.currentTimeMillis() - startTime) );
	}

	
	private void performSlowOperations() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
