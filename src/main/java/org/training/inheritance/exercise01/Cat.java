package org.training.inheritance.exercise01;

public class Cat extends Pet {
	private boolean neutered;
	private String markings;

	public boolean isNeutered() {
		return neutered;
	}

	public void setNeutered(boolean neutered) {
		this.neutered = neutered;
	}

	public String getMarkings() {
		return markings;
	}

	public void setMarkings(String markings) {
		this.markings = markings;
	}

}
