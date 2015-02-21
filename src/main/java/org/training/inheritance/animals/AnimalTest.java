package org.training.inheritance.animals;

import org.junit.Test;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird(); //cast up. automatically done by java
		Animal mammal = new Mammal();

		//survive((Bird)animal);
		survive(bird); 
		//survive((Bird)mammal);


	}

	public static void survive(Animal anAnimal) {
		anAnimal.move();
		anAnimal.eat();
	}

	public static void birdSurvive(Bird bird) {
		bird.move();
		bird.eat();
	}

	@Test
	public void testSurvive_CastUpExplicit() {
		System.out.println("testSurvive_CastUpExplicit");
		Animal animal = new Animal();
		Bird bird = new Bird(); 
		Mammal mammal = new Mammal();

		survive((Animal)animal);
		survive((Animal)bird); 
		survive((Animal)mammal);
	}

	@Test
	public void testSurvive_CastUpImplicit_1() {
		System.out.println("testSurvive_CastUpImplicit_1");
		Animal animal = new Animal();
		Bird bird = new Bird(); 
		Mammal mammal = new Mammal();

		survive(animal); //cast up
		survive(bird); //cast up
		survive(mammal); //cast up
	}

	@Test
	public void testSurvive_CastUpImplicit_2() {
		System.out.println("testSurvive_CastUpImplicit_2");
		Animal animal = new Animal(); //cast up
		Animal bird = new Bird(); //cast up
		Animal mammal = new Mammal(); //cast up

		survive(animal);
		survive(bird); 
		survive(mammal);
	}

	@Test
	public void testSurvive_CastDownExplict_Valid() {
		System.out.println("testSurvive_CastDownExplict_Valid");
		Animal bird = new Bird(); //cast up

		birdSurvive((Bird)bird); //cast back (down) to Bird 

	}

	@Test
	public void testSurvive_CastDownExplict_Invalid_1() {
		System.out.println("testSurvive_CastDownExplict_Invalid_1");
		Animal animal = new Animal(); //cast up

		try {
		birdSurvive((Bird)animal); //cast down ... not allowed at runtime
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testSurvive_CastDownExplict_Invalid_2() {
		System.out.println("testSurvive_CastDownExplict_Invalid_2");
		Mammal mammal = new Mammal(); //cast up

		try {
			//birdSurvive((Bird)mammal); //cast down ... not allowed at compile time 
		}
		catch(ClassCastException e) {
			e.printStackTrace();
		}

	}

}
