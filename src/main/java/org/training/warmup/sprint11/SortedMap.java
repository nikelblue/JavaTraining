package org.training.warmup.sprint11;

import java.util.Map;
import java.util.TreeMap;

import org.training.warmup.sprint11.Person;

public class SortedMap {

	public static void main(String[] args) {
		Person p1 = new Person("Jackie","Chan","jackie.chan@qq.com");
		Person p2 = new Person("Bruce","Lee","bruce.lee@qq.com");
		Person p3 = new Person("Silvester","Stalone","rocky@hotmail.com");
		Person p4 = new Person("Chack","Noris","the.legend@yahoo.com");
		
		FullNameKey k1 = new FullNameKey(p1);
		FullNameKey k2 = new FullNameKey(p2);
		FullNameKey k3 = new FullNameKey(p3);
		FullNameKey k4 = new FullNameKey(p4);
		
		EmailKey ek1 = new EmailKey(p1);
		EmailKey ek2 = new EmailKey(p2);
		EmailKey ek3 = new EmailKey(p3);
		EmailKey ek4 = new EmailKey(p4);
		
		Map<FullNameKey, Person> personsByName = new TreeMap<FullNameKey, Person>();
		Map<EmailKey, Person> personsByEmail = new TreeMap<EmailKey, Person>();

		personsByName.put(k1,p1);
		personsByName.put(k2,p2);
		personsByName.put(k3,p3);
		personsByName.put(k4,p4);
		
		//System.out.println(personsByName);
		
		for(Person person : personsByName.values()) {
			System.out.print(person);
		}
		
		personsByEmail.put(ek1, p1);
		personsByEmail.put(ek2, p2);
		personsByEmail.put(ek3, p3);
		personsByEmail.put(ek4, p4);
		
		//System.out.println(personsByEmail);
		
		System.out.println();
		
		for(Person person : personsByEmail.values()) {
			System.out.print(person);
		}
		
	}

}
