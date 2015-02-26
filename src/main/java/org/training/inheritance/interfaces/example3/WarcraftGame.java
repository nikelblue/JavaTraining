package org.training.inheritance.interfaces.example3;

public class WarcraftGame {
	public static void main(String[] args) {
		PrinceArthas arthas = new PrinceArthas();
		printName(arthas); //Arthas is a Character, OK
		fightWithSword(arthas); //Arthas is a Paladin, OK		
		castASpell(arthas); //Arthas is a Wizard, OK


		System.out.println("---");


		John john = new John();
		printName(john); //John is a Character, OK
		fightWithSword(john); //John is a Paladin, OK
		//castASpell(john); //John is not a Wizard, NOT OK
	}

	/**
	 * We don't care here which paladin we get. We only know that a paladin has the method 
	 * fightWithSword and that's all what it matters.
	 * 
	 * @param paladin
	 */
	public static void fightWithSword(Paladin paladin) {
		paladin.fightWithSword();
	}

	public static void printName(Character character) {
		System.out.println("Name:  " + character.getName());
	}

	public static void castASpell(Wizard wizard) {
		wizard.castSpell();
	}
}
