package org.training.threads.example10;

import java.util.Random;

abstract class Person extends Thread{
	private Person friend;
	private Random r = new Random();

	public Person(String name) {
		super(name);
	}

	public Person getFriend() {
		return friend;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}

	protected void waitForFriendAction(String action) {
		System.out.println(getName() + ":wait  : " + action);
		try {
			synchronized(friend) {
				friend.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void doSomething(String action) {
		System.out.println(getName() + ":      : " + action);
		try {
			sleep(r.nextInt(1000) + 5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void notifyFriend(String action) {
		System.out.println(getName() + ":notify: " + action);
		synchronized(friend) {
			friend.notify();
		}
	}

	
}
