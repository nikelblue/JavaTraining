package org.training.threads.example10;

public class Main {
	public static void main(String[] args) {
		BoyFriend john = new BoyFriend("John");
		GirlFriend jane = new GirlFriend("Jane");
		
		//They both like each other and became friends
		john.setFriend(jane);
		jane.setFriend(john);
		
		john.start(); //John is doing something
		jane.start(); // Jane is doing something too
	}
}
