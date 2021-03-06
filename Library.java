package LibraryApp;

import java.util.ArrayList;

public class Library {
	
	//inventory
	
	public ArrayList<Publication> Library = new ArrayList<>();
		
	private int publicationCount = 1;

	// add Publication
	public boolean addPublication(Publication publication) {
		publication.setinventory_id(publicationCount++);
		publication.setstatus("Available");
		return this.Library.add(publication);
	}
	
	// print library
	public void printLibrary() {
		System.out.println(this.Library);
	}
	
	//print Available Books

	public void printAvailableLibrary() {
		System.out.println("Books Available for Checkout: ");
		for (int i = 0; i < Library.size(); i++) {
			Publication currentPublication = Library.get(i);
			if (currentPublication.getstatus() == "Available") {
				System.out.print(currentPublication.toString());
			}
		}
    }

	
	//remove publication by id
	public boolean removePublication(Publication publication) {
		return this.Library.remove(publication);
	}

	public boolean removePublicationById(int input_id) {
		for (Publication p1 : this.Library) {
			if (p1.getinventory_id() == input_id) {
				return this.removePublication(p1);
			} 
		}
		if (input_id < 0 || input_id >= this.Library.size()) {
			try {
				throw new IndexOutOfBoundsException();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return false;
	}
	
	// Checkout Book from Title including exception handling
		
	public void checkoutPublications(String input_title) {
		for (Publication p1 : this.Library) {
			Publication selectedPublication = findPublications(input_title);
			if (p1.gettitle() == input_title && p1.getstatus() == "Available") {
				selectedPublication.setstatus("Unavailable");
				p1.printCheckout();
			} else if (p1.gettitle() == input_title && p1.getstatus() == "Unavailable"){
				try {
					throw new IncorrectTitleException("The Publication " + input_title + " is currently checked out by another Library Member. Please try again soon.");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

	// Check-in Book from Title 
	
	public void checkinPublications(String input_title) {
		for (Publication p1 : this.Library) {
			Publication selectedPublication = findPublications(input_title);
			if (p1.gettitle() == input_title && p1.getstatus() == "Unavailable") {
				selectedPublication.setstatus("Available");
				p1.printCheckin();
			} else if (p1.gettitle() == input_title && p1.getstatus() == "Available") {
				try {
					throw new IncorrectTitleException( input_title + " is not currently checked out of the Library");
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
	
	// Update Publication information
	
	//Find information
	public Publication findPublications(String input_title) {

		for (Publication p1 : this.Library) {
			if (p1.gettitle() == input_title) {
				return p1;
			} 
		}
		return null;
}
	public void printSearchResults(String input_title) {
		Publication p1 = findPublications(input_title);
		if (p1 != null ) {
			System.out.println("Search Result Found: " + findPublications(input_title));
		} else {
			try {
				throw new IncorrectTitleException( input_title + " is not a publication in this library");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	//Look at throwing Search Exception
	
	//Update
	public void updateStringPublications(String input_value, String new_value, String option) {
		Publication selectedPublication = findPublications(input_value);
		if (option == "title") {
			selectedPublication.settitle(new_value);
		} else if (option == "author") {
			selectedPublication.setauthor(new_value); 
		}
	}
	
	public void updateintPublications(String input_title, int new_value, String option) {
		Publication selectedPublication = findPublications(input_title);
		if (option == "Year Published") {
				selectedPublication.setyearPublished(new_value);
		} else if (option == "Publication Legnth") {
			selectedPublication.setpublicationLegnth(new_value); 
		}
	}	
}
