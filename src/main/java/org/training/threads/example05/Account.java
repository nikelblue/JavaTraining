package org.training.threads.example05;

final class Account {
	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
		System.out.print(" deposit " + amount);
		
	}

	public void withdraw(int amount) {
		balance -= amount;
		System.out.print(" withdraw " + amount);
		
	}

	public synchronized void nullOperation(int amount) {
		balance += amount;
		System.out.print(" deposit " + amount);
		balance -= amount;
		System.out.print(" withdraw " + amount);
	}

	public synchronized int getBalance() {
		return balance;
	}
}
