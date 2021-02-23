package LibraryApp;

import java.util.ArrayList;

public class customerList {

	public ArrayList<Customer> customerList = new ArrayList<>();
	
	private int customerCount = 1;

	// add Person
	public boolean registerPerson(Customer person) {
		person.setcustomer_id(customerCount++);
		return this.customerList.add(person);
	}
		
	// print list
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
	//Find information
	public Customer findCustomers(int customer_id) {
		for (Customer p1 : this.customerList) {
			if (p1.getcustomer_id() == customer_id) {
				return p1;
			}
		}
		return null;
	}
	
	public void printCustomerSearchResults(int input_id) {
		Customer p1 = findCustomers(input_id);
		if (p1.getcustomer_id() == input_id) {
			System.out.println("Search Result Found: " + findCustomers(input_id));
		} else {
			System.out.println("Search Result not Found");
		}
	}
		
	//Update
	public void updateStringCustomers(int customer_id, String new_value, String option) {
		Customer selectedCustomer = findCustomers(customer_id);
		if (option == "First Name") {
			selectedCustomer.setfirstName(new_value);
		} else if (option == "Surname") {
			selectedCustomer.setsurname(new_value); 
		} else if (option == "Postcode") {
			selectedCustomer.setpostcode(new_value); 
		}
	}
		
	public void updateintCustomers(int customer_id, int new_value, String option) {
		Customer selectedCustomer = findCustomers(customer_id);
		if (option == "Age") {
			selectedCustomer.setage(new_value);
		}
	}
	
}
