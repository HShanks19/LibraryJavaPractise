package LibraryApp;

public class publicationJournals extends Publication implements borrow{

	public publicationJournals(String title, String author, int yearPublished, int publicationLegnth, String journalName) {
		super(title, author, yearPublished, publicationLegnth);
		this.setjournalName(journalName);
	}

	private String journalName;
	
	public String getjournalName(){
        return journalName;
	}
	public void setjournalName(String newjournalName){
        this.journalName = newjournalName;
	}
	@Override
	public String toString() {
		return "Publication [id: " + getinventory_id() + ", title: " + gettitle() + ", Journal Name : " + journalName + ", author: " + getauthor() + ", Year Published: " + getyearPublished() + ", Publication Legnth: " + getpublicationLegnth() +", Borrow Period: " + borrowPeriod() +"]";
	}
	@Override
	public String borrowPeriod() {
		return "1 month";
	}
	public void borrowable() {
		System.out.println("Item cannot be borrowed.");
	}

}
