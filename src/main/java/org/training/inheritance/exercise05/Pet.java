package org.training.inheritance.exercise05;

import java.util.Date;

public class Pet {
	//	You have been given a design document for a veterinary registration system for implementation
	//	in Java. It states:
	//	
	//	��A pet has an owner, a registration date, and a vaccination-due date. A cat is a pet that has a
	//	flag indicating if it has been neutered, and a textual description of its markings.��
	//	
	//	1) Define class Pet (this class) according to the statement above.
	//	2) Given that you expect the Cat class to be used freely
	//	throughout the application, how would you make the opening declaration of the Cat class, up
	//	to but not including the first opening brace? Use only these words and spaces: boolean, Cat,
	//	class, Date, extends, Object, Owner, Pet, private, protected, public, String.
	//		A. protected class Cat extends Owner
	//		B. public class Cat extends Object
	//		C. public class Cat extends Pet
	//		D. private class Cat extends Pet
	//	Define class Cat in same package but separate file.

	private Date registered;
	private Date vaccinationDue;
	private String ownerName;

	public Pet() {
		super();
	}

	public Pet(Date vaccinationDue, String ownerName, Date registered) {
		registered = this.registered;
		vaccinationDue = this.vaccinationDue;
		ownerName = this.ownerName;
	}

	public Date getRegistered() {
		return registered;
	}

	public void setRegistered(Date registered) {
		this.registered = registered;
	}

	public Date getVaccinationDue() {
		return vaccinationDue;
	}

	public void setVaccinationDue(Date vaccinationDue) {
		this.vaccinationDue = vaccinationDue;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
