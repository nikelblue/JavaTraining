/**
 * 
 */
package org.training.hashcode;

/**
 * @author nikelblue
 *
 */
class Person {
	protected String name;
	protected Integer age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = Integer.valueOf(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * We consider two persons are equals if they have same name and same age.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * i.e. 'Person: Gary/35' 
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + ": " + name + "/" + age;
	}
}
