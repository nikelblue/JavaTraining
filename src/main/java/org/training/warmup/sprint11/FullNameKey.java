package org.training.warmup.sprint11;

public class FullNameKey implements Comparable<FullNameKey>{
	
	private String fullName;


	public FullNameKey(Person person) {
		this.fullName =person.getLastName() + " " + person.getFirstName() ;
	}
	
	public FullNameKey(String firstName, String lastName){
		this.setFullName(firstName + " " + lastName);
	}


	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return fullName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fullName == null) ? 0 : fullName.hashCode());
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
		FullNameKey other = (FullNameKey) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		return true;
	}

	public int compareTo(FullNameKey other) {
		if(other == null)
			return 1;
		
		String fullName = this.fullName;
		String otherFullName = other.fullName;	

		return fullName.compareToIgnoreCase(otherFullName);
	}
	
	
}
