package org.training.threads.example10;

final class BoyFriend extends Person {

	public BoyFriend(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		GirlFriend girlFriend = (GirlFriend) getFriend();
		if(girlFriend == null) {
			System.out.println("I don't have any girlfriend. I feel sad....");
			return;
		}
		
		waitForFriendAction("I am waiting for my girlfriend " + girlFriend.getName());
		
		doSomething("Hi " + girlFriend.getName() + "! you look great today.");
		
		
		
	}

}
