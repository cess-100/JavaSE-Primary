package com.cess.day11;

public class CustomerList {
	private Customer[] customers;
	private int count;

	public CustomerList(int count) {
		customers = new Customer[count];
	}

	// 数组添加Customer
	public void addCustomer(Customer customer) {
		if (count < customers.length) {
			customers[count++] = customer;
		}
	}

	public Customer[] getAllCustomers() {
		return customers;
	}

	public Customer getCustomer(int number) {
		return customers[number];
	}

	public int getCount() {
		return count;
	}

	public void replaceCustomer(Customer newCustomer, int number) {
		customers[number] = newCustomer;
	}

	public void deleteCustomer(int number) {
		for (int i = number; i < count - 1; i++) {
			customers[i] = customers[i + 1];
		}
		customers[--count] = null;
	}
	

}
