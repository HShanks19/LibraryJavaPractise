package LibraryApp;

import java.util.ArrayList;

public class Library {

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

		return false;
	}
	
	// Checkout Book from Title
		
	public void checkoutPublications(String input_title) {
		for (Publication p1 : this.Library) {
			if (p1.gettitle() == input_title && p1.getstatus() == "Available") {
				p1.setstatus("Unavailable");
				p1.printCheckout();
			} else if (p1.getstatus() == "Unavailable"){
				p1.printCheckoutError();
			}
		}
		return;
	}
	
	// Check-in Book from Title 
	
	public void checkinPublications(String input_title) {

		for (Publication p1 : this.Library) {
			if (p1.gettitle() == input_title && p1.getstatus() == "Unavailable") {
				p1.printCheckin();
				p1.setstatus("Available");
			} else if (p1.gettitle() == input_title && p1.getstatus() == "Available"){
				p1.printCheckinError();
			}
		}
		return;
	}
	
	
	
	
	
	
	
	
}
