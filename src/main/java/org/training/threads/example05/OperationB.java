/**
 * 
 */
package org.training.threads.example05;

/**
 * @author nikelblue
 *
 */
final class OperationB extends Thread {
	private Account account;

	public OperationB(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		while (true) {
			int amount = (int) (Math.random() * 10000);
			String name = getName();

			System.out.print(name);
			synchronized(account){
			account.deposit(amount);
			account.withdraw(amount);
			}
			int balance = account.getBalance();
			System.out.println(" " + name);

			if (balance != 0) {
				System.err.println(name + ":**balance=" + balance);
				System.exit(1);
			}
		}
	}

	/**
	 * TODO: Analyze the output. At each iteration a null operation is performed (line 24).
	 * We expect the balance to remain 0. 
	 * The application exits if balance is different from 0.
	 * 
	 * After few loops the balance will be different from 0, and application will exit.
	 * Can you explain why? 
	 * 
	 * Add a fix to this problem. After fixing the code, the app should loop infinitely.
	 * @param args
	 */
	public static void main(String[] args) {
		Account compte = new Account();
		for (int i = 0; i < 20; i++) {
			OperationB operation = new OperationB("A" + i, compte);
			operation.start();
		}
	}

}
