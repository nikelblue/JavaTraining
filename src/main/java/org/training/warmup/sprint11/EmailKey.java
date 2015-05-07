package org.training.warmup.sprint11;

public class EmailKey implements Comparable<EmailKey>{
    private String email;
	
	public EmailKey(Person person){
		this.email = person.getEmail();
	}
	public EmailKey(String email){
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		EmailKey other = (EmailKey) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	public int compareTo(EmailKey other) {
		if(other == null)
			return 1;
		
		String email = this.email;
		String otherEmail = other.email;		

		return email.compareToIgnoreCase(otherEmail);
	}

	
	
}
