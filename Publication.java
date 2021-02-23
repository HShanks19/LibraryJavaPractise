package LibraryApp;

public abstract class Publication {

	public Publication(String title, String author, int yearPublished, int publicationLegnth) {
		
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.publicationLegnth = publicationLegnth;
	}
	
	private String title;
	
	private String author;
	
	private int yearPublished;
	
	private int publicationLegnth;
	
	private int inventory_id;
	
	public abstract String borrowPeriod();
	
	private String status;
	
	@Override
	public String toString() {
		return "Publication [id: " + inventory_id + ", title: " + title + ", author: " + author + ", Year Published: " + yearPublished + ", Publication Legnth: " + publicationLegnth +"]";
	}
	
	public void printCheckout() {
		System.out.println("Item: " + title + " has been checked out of the library. You have: " + borrowPeriod() + " to return.");
	}
	
	public void printCheckoutError() {
		System.out.println("This item has already been checkout out of the Library. Sorry for any inconvinience.");
	}
	
	public void printCheckin() {
		System.out.println("Item: " + title + " has been checked back in to the library. Thank you.");
	}
	
	public void printCheckinError() {
		System.out.println("This item was never checked out of the library. Please seek assistance.");
	}
	
	public String getstatus(){
        return status;
	}
	public void setstatus(String newstatus){
        this.status = newstatus;
	}
	
	public String gettitle(){
        return title;
	}
	public void settitle(String newtitle){
        this.title = newtitle;
	}
	
	public String getauthor(){
        return author;
	}
	public void setauthor(String newauthor){
        this.author = newauthor;
	}
	
	public int getyearPublished(){
        return yearPublished;
	}
	public void setyearPublished(int newyearPublished){
        this.yearPublished = newyearPublished;
	}
	
	public int getpublicationLegnth(){
        return publicationLegnth;
	}
	public void setpublicationLegnth(int newpublicationLegnth){
        this.publicationLegnth = newpublicationLegnth;
	}
	
	public int getinventory_id() {
		return inventory_id;
	}

	public void setinventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
}
	
