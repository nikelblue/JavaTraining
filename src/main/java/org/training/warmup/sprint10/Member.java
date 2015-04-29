/**
 * 
 */
package org.training.warmup.sprint10;

import org.training.warmup.sprint9.Point3D;

/**
 * @author monkey
 * 
 * A Member has the following properties:
String name;
Integer age;

public Member(String name, int age);

Two members are considered to be the same if both have same name and age.

A member can be printed in this format:
name/age (i.e. Jon Smith/35)
 *
 */
public class Member {
	private String name;
	private Integer age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	

	public boolean equals(Object obj) {
		if( this == obj )
			return true;
		
		if(!(obj instanceof Member))
			return false;
		
		Member other = (Member) obj;
		return 
				this.name == other.name && 
				this.age == other.age ;
	}
	
	public String toString() {
		return getName()+"/"+getAge();
	}
}
