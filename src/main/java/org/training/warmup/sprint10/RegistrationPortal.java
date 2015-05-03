/**
 * 
 */
package org.training.warmup.sprint10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author monkey
 *There is a RegistrationPortal which allows team members to register. it has the following methods:

1) public boolean registerMember(Member member);
Returns true if member was successfully registered or false if member already registered. 
It also prints out a message describing the operation:
"Member [member] registred successfuly" [for true result] or
"Member [member] already registered" [for false result]

2) Collection<Member> getRegisteredMembers();
 */
public class RegistrationPortal {

	private Set<Member> members = new HashSet<Member>();
	
	
	public static void main(String[] args) {
		Member m1 = new Member("Garry", 39);
		Member m2 = new Member("Jimmy", 36);
		Member m3 = new Member("Anthony", 35);



		RegistrationPortal portal = new RegistrationPortal();
		portal.registerMember(m1); //-> true
		portal.registerMember(m2); //-> true
		portal.registerMember(m3); //-> true
		portal.registerMember(m3); //-> false

		Member m4 = new Member("Anthony", 35);
		portal.registerMember(m4); //-> false
		System.out.println("registered member: " + portal.getRegisteredMembers());
	}
	
	/*
	 * Set#add(element) returns true if element didn't exist before and it has been successfully added.
	 */
	public boolean registerMember(Member member) {
		
		boolean isReg = members.add(member);
		
		if(isReg){
			System.out.println("Member [" + member.getName()+"] registered successfuly");
		}else{
			System.out.println("Member [" + member.getName()+"] already registered");
		}
			
		return isReg;
	}
	
	
	public Collection<Member> getRegisteredMembers() {
		return members;
	}

}
