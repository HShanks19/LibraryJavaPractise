package LibraryApp;

import java.util.ArrayList;

public class customerList {

	public ArrayList<Customer> customerList = new ArrayList<>();
	
	private int customerCount = 1;

	// add Publication
	public boolean registerPerson(Customer person) {
		person.setcustomer_id(customerCount++);
		return this.customerList.add(person);
	}
		
	// print library
	public void printCustomerList() {
		System.out.println(this.customerList);
	}
	
	// remove person
	public boolean removePerson(Customer person) {
		return this.customerList.remove(person);
	}

	public boolean removePersonById(int input_id) {
		for (Customer p1 : this.customerList) {
			if (p1.getcustomer_id() == input_id) {
				return this.removePerson(p1);
			}
		}

		return false;
	}
}
