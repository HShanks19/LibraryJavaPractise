package LibraryApp;

public class Customer {

	public Customer (String firstName, String surname, int age, String postcode) {
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.postcode = postcode;
		
	}
		
	private String firstName;
		
	private String surname;
		
	private int age;
		
	private String postcode;
	
	private int customer_id;
	
	@Override
	public String toString() {
		return "Customer Profile [id: " + customer_id + ", Name: " + firstName + " " + surname + ", Age: " + age + ", Postcode: " + postcode +"]";
	}
		
	public String getfirstName(){
	       return firstName;
	} 
		
	public void setfirstName(String newfirstName){
	    this.firstName = newfirstName;
	}
	public String getsurname(){
	       return surname;
	} 
		
	public void setsurname(String newsurname){
	    this.surname = newsurname;
	}
	public int getage() {
		return age;
	}
	public void setage (int newAge) {
		this.age = newAge;
	}
	public String getpostcode(){
	       return postcode;
	} 
		
	public void setpostcode(String newpostcode){
	    this.postcode = newpostcode;
	}
	public int getcustomer_id() {
		return customer_id;
	}

	public void setcustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
		
}

