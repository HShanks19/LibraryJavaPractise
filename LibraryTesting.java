package com.qa.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import LibraryApp.Library;
import LibraryApp.Publication;
import LibraryApp.publicationBook;

public class LibraryTesting {

	Library library1 = new Library();
	Publication p1 = new publicationBook("Harry Potter and the Philosophers Stone", "Rowling, JK ", 1997, 223, "0-7475-3269-9");
	
	
	@Test
	public void test() {
		int expected = 1;
		library1.addPublication(p1);
		int actual = p1.getinventory_id();
	 
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		String expected = "Publication [id: 1, title: Harry Potter and the Philosophers Stone, author: Rowling, JK , Year Published: 1997, Publication Legnth: 223, ISBN number: 0-7475-3269-9, Borrow Period: 2 weeks]";
		library1.addPublication(p1);
		library1.findPublications("Harry Potter and the Philosophers Stone");
		String actual = p1.toString();
	 
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void test3() {
		String expected = "Unavailable";
		library1.addPublication(p1);
		library1.checkoutPublications("Harry Potter and the Philosophers Stone");
		String actual = p1.getstatus();
	 
		assertEquals(expected,actual);
	}
	
	

}
