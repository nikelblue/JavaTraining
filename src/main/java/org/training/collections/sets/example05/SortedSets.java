package org.training.collections.sets.example05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SortedSets {

	public static void main(String[] args) {
		Set<String> strings = new HashSet<String>();
		strings.add("CCC");
		strings.add("BBB");
		strings.add("DDD");
		strings.add("AAA");
		System.out.println(strings);
		
		//TreeSet is another kind of set which order the containing elements
		//using natural order (i.e. ascending for Strings ot Numbers). We call
		//it SortedSet
		Set<String> sortedStrings = new TreeSet<String>();
		sortedStrings.add("CCC");
		sortedStrings.add("BBB");
		sortedStrings.add("DDD");
		sortedStrings.add("AAA");
		System.out.println(sortedStrings); //The strings are sorted out ascending
		
		Set<Person> persons = new HashSet<Person>();
		//Person p1 = new Person("Jackie", "Chan");
		//Person p2 = new Person("Bruce", "Lee");
		//Person p3 = new Person("Eva", "Mendes");
		//Person p4 = new Person("Eva", "Longoria");
		
		Person p1 = new Person("b", "b");
		Person p2 = new Person("a", "c");
		Person p3 = new Person("c", "a");
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		//persons.add(p4);
		System.out.println(persons);
		
		//Lets try to add our persons to a TreeSet attempting to sort the persons.
		//What order will be used? Explain the result.
		Set<Person> sortedPersons = new TreeSet<Person>();
		sortedPersons.add(p1); 
		sortedPersons.add(p2);
		sortedPersons.add(p3);
		//sortedPersons.add(p4);
		System.out.println(sortedPersons);
		//As we remember from previous lessons, to sort an array we need a Comparator
		//to compare array elements.
		//
		//In similar way, a SortedSet (like TreeSet) attempts to compare somehow 
		//the containing elements in order to order them. Therefore, it publishes a contract:
		//- in order for the contained elements to be sorted, they must be Comparable.
		//
		//It simply means: the containing elements must implement Comparable interface. 
		//TODO: Modify Person class to implement Comparable interface so the persons 
		//will be sorted descending, and try again.
		//
		//Explain why Strings were succesfully sorted by TreeSet. 
		//What do you think: Integer will be also successfully sorted by TreeSet?
	}
}
