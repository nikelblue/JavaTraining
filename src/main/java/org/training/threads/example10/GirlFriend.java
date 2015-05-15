package org.training.threads.example10;

final class GirlFriend extends Person {

	public GirlFriend(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Person boyFriend =  getFriend();
		if(boyFriend == null) {
			System.out.println("I don't have any boyfriend. I feel sad....");
			return;
		}
		
		
		doSomething("I hurry to meet my boyfriend " + boyFriend.getName());
		
		notifyFriend("Aha... There he is. Hi " + boyFriend.getName() + "!");
		
		
		
	}

}
