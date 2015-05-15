package org.training.threads.example04;


/**
 * 
 * @author nikelblue
 *
 */
final class ThreadSafeIntegerHolder2 implements IntegerHolder{
	private int value = 0;
	
	
	//Our incrementAndGet() method has a piece of very slow code: performSlowOperation().
	//If we synchronize the full method and Thread-1 call the method, then Thread-2 has to wait 
	//for the monitor until full method is executed (including the slow code). 
	//
	//It would be a nice improvement if Thread-2 can increment the value while Thread-1 is performing
	//the slow operation. For this reason, Java offers a way to synchronize only pieces of code
	//instead of the full method.
	//
	//This can be achieved using: 'synchronized' keyword. 'synchronized' accepts any object as parameter.
	//If one thread needs to execute the piece of code within 'synchronized' block, then it will attempt to
	//take the ownership of the given object's monitor. In our example, the tread will take the ownership
	//of the current instance (this) monitor. It's the same monitor as on the previous example (synchronize full method).
	public int incrementAndGet() {
		int result;
		synchronized(this) { //Monitor of this instance will be owned from here. Other threads will wait here until monitor will be released.
			value++; //the code in this block can be executed only by one thread at a time (the tread that owns the monitor of this instance)
			result = value;
		} //to here
		performSlowOperations(); //The code from here can be executed by multiple threads in parallel
		return result;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadSafeIntegerHolder2 integerHolder = new ThreadSafeIntegerHolder2();
		
		Thread t1 = new IncrementerThread(integerHolder);
		Thread t2 = new IncrementerThread(integerHolder);
		
		long startTime = System.currentTimeMillis();
		
		//We start two threads. Each of them will get the next integer value
		//and will print it out.
		t1.start();
		t2.start();
		
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
