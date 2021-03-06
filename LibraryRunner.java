package LibraryApp;

public class LibraryRunner {

	public static void main(String[] args) {
		Library libraryInventory = new Library();
		customerList customerList1 = new customerList();
		
		// Adding Publications
		libraryInventory.addPublication(new publicationBook("Harry Potter and the Philosophers Stone", "Rowling, JK ", 1997, 223, "0-7475-3269-9"));
		libraryInventory.addPublication(new publicationBook("Harry Potter and the Chamber of Secrets", "Rowling, JK.", 1999, 251, "0-7475-3849-2"));
		libraryInventory.addPublication(new publicationJournals("River Pollution and Health in Indonesia", "Garg, T.", 2018, 17, "Journal of Environmental Economics and Management"));
		libraryInventory.addPublication(new publicationJournals("Health Effects of outdoor air pollution", "Bascom. R,", 1996, 22, "Journal of Respiritory and critical care medicine"));
		libraryInventory.addPublication(new publicationNewspapers("The Sunday Times", "Boswell, J. ", 2017, 13, "Iceburg Lettuce hit by titanic rise in price"));
		libraryInventory.addPublication(new publicationNewspapers("Blue Ridge Now", "McCraw, A. ", 2001, 5, "Murderer says detective ruined his reputation"));
		
		// Print Library
		libraryInventory.printLibrary();
		
		// Remove Publication by Inventory ID
		libraryInventory.removePublicationById(2);
		
		//Exception Practice 
		libraryInventory.removePublicationById(76); //Throws IndexOutOfBoundsException
		
		//Checkout Publication
		libraryInventory.checkoutPublications("Harry Potter and the Philosophers Stone");
		libraryInventory.checkoutPublications("Harry Potter and the Philosophers Stone"); //Throws IncorrectTitleException
		
		//Check-in Publication
		libraryInventory.checkinPublications("Harry Potter and the Philosophers Stone");
		libraryInventory.checkinPublications("Harry Potter and the Philosophers Stone"); // Throws IncorrectTitleException
		
		// Print Available Library
		libraryInventory.printAvailableLibrary();
		
		// Find Publication
		libraryInventory.printSearchResults("River Pollution and Health in Indonesia");
		libraryInventory.printSearchResults("Incorrect Title");
		
		// Update Publication
		libraryInventory.updateStringPublications("River Pollution and Health in Indonesia", "River Pollution and Health in Indonesia Amended", "title");
		libraryInventory.updateintPublications("River Pollution and Health in Indonesia Amended", 25, "Publication Legnth");
		
		// Adding People
		customerList1.registerPerson(new Customer("Tracy", "Shanks", 45, "YO5 6ND"));
		customerList1.registerPerson(new Customer("Millie", "Overt", 63, "YO10 5NN"));
		customerList1.registerPerson(new Customer("Craig", "Elliot", 32, "Y07 6FR"));
		customerList1.registerPerson(new Customer("Alex", "Moore", 73, "Y01 4WS"));
		
		//Print Customer List
		customerList1.printCustomerList();
		
		//Delete Person by Customer id
		customerList1.removePersonById(2);		
		
		// Find Customer
		customerList1.printCustomerSearchResults(3);
		
		// Update Customer
		customerList1.updateintCustomers(1, 12, "Age");
		customerList1.updateStringCustomers(1, "Holly", "First Name");
	
		// Find Customer
		customerList1.printCustomerSearchResults(1);
	}

}
