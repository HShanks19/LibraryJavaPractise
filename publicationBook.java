package LibraryApp;

public class publicationBook extends Publication{

	public publicationBook(String title, String author, int yearPublished, int publicationLegnth, String ISBN_number) {
		super(title, author, yearPublished, publicationLegnth);
		this.setISBNNumber(ISBNNumber);
	}

	private String ISBNNumber;
	
	public String getISBN_number(){
        return ISBNNumber;
	}
	public void setISBNNumber(String newISBNNumber){
        this.ISBNNumber = newISBNNumber;
	}
	@Override
	public String toString() {
		return "Publication [id: " + getinventory_id() + ", title: " + gettitle() + ", author: " + getauthor() + ", Year Published: " + getyearPublished() + ", Publication Legnth: " + getpublicationLegnth() +", ISBN number: " + ISBNNumber +", Borrow Period: " + borrowPeriod() +"]";
	}
	@Override
	public String borrowPeriod() {
		return "2 weeks";
	}
}
