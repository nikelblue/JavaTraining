package org.training.hashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author DanielB
 *
 */
class HashCodeExample {
	public static void main(String[] args) {
		Person p1, p2, p3, p4;

		Set<Person> persons = new HashSet<Person>();
		p1 = new Person("Jimmy", 37);
		p2 = new Person("Gary", 35);
		p3 = new Person("Anthony", 32);
		p4 = new Person("Gary", 35); // p2.equals(p4) == true
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		System.out.println(persons);
		//Let's analyze the output. We can easily notice an interesting aspect:
		//Gary appears twice. Hey! Wait a bit! Set states that it doesn't allow 
		//duplicates, but p2.equals(p4) == true. What's wrong then?
		//
		//We used a set named HashSet. Any Hash... collection uses special hash 
		//algorithms in order to quickly find elements. 
		//
		//We learned by analyzing examples from SearchEngine, that using
		//binary search algorithm is really fast and the speed is predictable.
		//But, binary search algorithms work only on sorted collections. The order
		//we introduce elements in set is random. Therefore, Set classes internally
		//sort and group the containing elements. How do they do that? They need 
		//to calculate an integer value for each element and sort/group by that 
		//integer. We call that integer value: hash code. 
		//
		//
		//Object class publish a method: 
		// public int hashCode()
		//therefore all object will inherit it. Set classes know that, therefore 
		//they invoke hashCode() method on all containing elements in order to
		//obtain the hash code. 
		//
		//The hashCode() method of objects is used when you insert them into a 
		//HashTable, HashMap or HashSet. If you do not know the theory of how a 
		//hashtable works internally, you can read about hashtables on Wikipedia.org:
		//http://en.wikipedia.org/wiki/Hash_table
		//
		//When inserting an object into a hashtable you use a key. The hash code 
		//of this key is calculated, and used to determine where to store the 
		//object internally. When you need to lookup an object in a hashtable 
		//you also use a key. The hash code of this key is calculated and used 
		//to determine where to search for the object.
		//
		//The hash code only points to a certain "area" (or list, bucket etc) 
		//internally. Since different key objects could potentially have the same 
		//hash code, the hash code itself is no guarantee that the right key is 
		//found. The hashtable then iterates this area (all keys with the same 
		//hash code) and uses the key's equals() method to find the right key. 
		//Once the right key is found, the object stored for that key is returned.
		//
		//So, as you can see, a combination of the hashCode() and equals() methods 
		//are used when storing and when looking up objects in a hashtable.
		//
		//Here are two rules that are good to know about implementing the hashCode() 
		//method in your own classes, if the hashtables in the Java Collections API 
		//are to work correctly:
		//
		//		1) If object1 and object2 are equal according to their equals() method,
		//		   they must also have the same hash code.
		//		2) If object1 and object2 have the same hash code, they do NOT have 
		//		   to be equal too.
		//
		//In shorter words:
		//
		//		1) If equal, then same hash codes too.
		//		2) Same hash codes no guarantee of being equal.
		//
		//These rules are stated by Object#hashCode() contract:
		//http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode%28%29
		//
		//Default implementation of Object#hashCode() is to compute
		//the hash code based on the object address in memory. Therefore,
		//if we implemented equals() method for a class, two different instances
		//of same object (i.e. p2 and p4) might be equals. On the other hands
		//their memory address is different (they are different instances) so
		//their hash code will be different. This is against the contract published
		//by Object#hashCode(). Violating this contract might
		//have unexpected result (see the HashSet behavior regarding Gary)
		
		//Ok. HashPerson is a Person for which we implemented the hashCode() method.
		//We instantiate same persons again (this time with correct hashCode)
		//and add them to another set.
		Set<Person> hashPersons = new HashSet<Person>();
		p1 = new HashPerson("Jimmy", 37);
		p2 = new HashPerson("Gary", 35);
		p3 = new HashPerson("Anthony", 32);
		p4 = new HashPerson("Gary", 35); //same as p2
		hashPersons.add(p1);
		hashPersons.add(p2);
		hashPersons.add(p3);
		hashPersons.add(p4); //p2.equals(p4) == true
		System.out.println(hashPersons);
		//Looks great. Gary is not duplicated anymore.
		
		//CONCLUSION: if equals() then hashCode()!!!!
		
	}
}
