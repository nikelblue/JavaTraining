package org.training.inheritance.animals;

public class Bird extends Animal {

	public String getName() {
		return "Bird";
	}
	
	public void fly() {
		System.out.println(getName() + ": flying...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.eat();
		bird.fly();

		Animal anotherBird; //we declare it as animal, so Java will see it as an Animal
		anotherBird =  new Bird(); //particularly that animal is a bird. But only we know that. Java doesn't
		anotherBird.move();
		((Bird)anotherBird).fly(); //Hey Java. Can't you see this is Bird, therefore it can fly?
	}

}
