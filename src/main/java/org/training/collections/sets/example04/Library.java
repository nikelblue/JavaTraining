package org.training.collections.sets.example04;

import java.util.HashSet;
import java.util.Set;

final class Library {
	public static void main(String[] args) {
		Set<Book> library = new HashSet<Book>();
		
		//We instantiate few books...
		Book book1 = new Book("111111111", "Kant", "Universal Natural History and Theory of Heaven");
		Book book2 = new Book("111111112", "Hegel, Georg Wilhelm Friedrich", "Phenomenology of Mind");
		Book book3 = new Book("111111113", "Schopenhauer, Arthur", "On the Freedom of the Will");
		
		//...and we add them to library
		library.add(book1);
		library.add(book2);
		library.add(book3);
		printLibrary(library); //All the books are there
		
		//Ups.. We forgot to set the full name for Kant. Let's fix it
		System.out.println("Renaming author of book " + book1.getIsbn() + " to Kant, Immanuel");
		System.out.println();
		book1.setAuthor("Kant, Immanuel");
		printLibrary(library); //Book1 has been successfully updated
		//But wait a moment!!! It looks that library doesn not
		//contain our book anymore. Is out library haunted? The book is there 
		//but not there!!!
		

		//Ok... Maybe it was a mistake. Let's try to remove book1 to correct
		//our library status.
		System.out.println("Removing book from library: " + book1);
		System.out.println();
		library.remove(book1);
		printLibrary(library); //Ups
		//The book is still listed in our library. Still library says it doesn't
		//contain that book. 
		//
		//Our data is inconsistent. How could this happen???
		//Please find the cause and come with a solution for this issue to not 
		//happen again.
	}
	
	private static void printLibrary(Set<Book> library) {
		
		for (Book book : library) {
			System.out.printf("%-5s | %-12s | %-50s | %s\n", 
					library.contains(book),
					book.getIsbn(), 
					book.getAuthor(), 
					book.getName());
		}
		System.out.println("\n====================================\n");
	}
}
