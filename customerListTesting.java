package com.qa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import LibraryApp.Customer;
import LibraryApp.customerList;

public class customerListTesting {

	customerList list1 = new customerList();
	Customer p1 = new Customer("Tracy", "Shanks", 45, "YO5 6ND");
	
	@Test
	public void test() {
		int expected = 1;
		list1.registerPerson(p1);
		int actual = p1.getcustomer_id();
	 
		assertEquals(expected,actual);
	}
	@Test
	public void test2() {
		int expected = 2;
		list1.registerPerson(p1);
		list1.updateintCustomers(1, 2, "age");
		int actual = p1.getage();
	 
		assertEquals(expected,actual);
	}
	
	
}
