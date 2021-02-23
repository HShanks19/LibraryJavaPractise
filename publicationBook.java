package LibraryApp;

public class publicationBook extends Publication implements borrow {

	public publicationBook(String title, String author, int yearPublished, int publicationLegnth, String ISBN_number) {
		super(title, author, yearPublished, publicationLegnth);
		this.setISBN_number(ISBN_number);
	}

	private String ISBN_number;
	
	public String getISBN_number(){
        return ISBN_number;
	}
	
	public void setISBN_number(String newISBN_number){
        this.ISBN_number = newISBN_number;
	}
	
	@Override
	public String toString() {
		return "Publication [id: " + getinventory_id() + ", title: " + gettitle() + ", author: " + getauthor() + ", Year Published: " + getyearPublished() + ", Publication Legnth: " + getpublicationLegnth() +", ISBN number: " + getISBN_number() +", Borrow Period: " + borrowPeriod() +"]";
	}
	
	@Override
	public String borrowPeriod() {
		return "2 weeks";
	}
	public void borrowable() {
		System.out.println("Item can be borrowed.");
	}
}
