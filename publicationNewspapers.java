package LibraryApp;

public class publicationNewspapers extends Publication {

	public publicationNewspapers(String title, String author, int yearPublished, int publicationLegnth, String headline) {
		super(title, author, yearPublished, publicationLegnth);
		this.setheadline(headline);
	}

	private String headline;
	
	public String getheadline(){
        return headline;
	}
	
	public void setheadline(String newheadline){
        this.headline = newheadline;
	}
	
	@Override
	public String toString() {
		return "Publication [id: " + getinventory_id() + ", title: " + gettitle() + ", Front Page Headline : " + headline + ", author: " + getauthor() + ", Year Published: " + getyearPublished() + ", Publication Legnth: " + getpublicationLegnth() +", Borrow Period: " + borrowPeriod() +"]";
	}
	
	@Override
	public String borrowPeriod() {
		return "1 week";
	}

}
