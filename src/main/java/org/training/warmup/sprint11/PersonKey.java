package org.training.warmup.sprint11;

import java.util.HashMap;
import java.util.Map;

public class PersonKey {
	
	private String firstName;
	private String lastName;
	
	
	public PersonKey(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	@Override
	public String toString() {
		return firstName + " " + lastName +"n/";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonKey other = (PersonKey) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Map<PersonKey, Person> persons = new HashMap<PersonKey, Person>();
		
		Person p1 = new Person("Jacky","Chan","jackChan@hotmail.com");
		Person p2 = new Person("Jet","Li","JetLi@hotmail.com");

		//persons.put(p1.getKey(),p1);
		//persons.put(p2.getKey(),p2);
		
		for(Map.Entry<PersonKey, Person> entry : persons.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
