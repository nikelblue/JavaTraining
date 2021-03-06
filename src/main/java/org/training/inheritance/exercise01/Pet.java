/**
 * 
 */
package org.training.inheritance.exercise01;

import java.util.Date;

/**
 * <p>You have been given a design document for a veterinary registration system for implementation
 * in Java. It states:</p>
 * 
 * <p>��A pet has an owner, a registration date, and a vaccination-due date. A cat is a pet that has a
 * flag indicating whether it has been neutered, and a textual description of its markings.��</p>
 * 
 * <ol>
 * <li> Define class Pet (this class) according to the statement above.</li>
 * <li> which of the following fields would be appropriate for inclusion in the 
 * Cat class as members? (Choose all that apply.)
 * 		<ol type="A">
 * 		<li> Pet thePet;
 * 		<li> Date registered;
 * 		<li> Date vaccinationDue;
 * 		<li> Cat theCat;
 * 		<li> boolean neutered;
 * 		<li> String markings;
 * 		</ol>
 * Define class Cat accordingly, in same package but separate file.
 * </ol>
 * @author nikelblue
 *
 */
public class Pet {

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
