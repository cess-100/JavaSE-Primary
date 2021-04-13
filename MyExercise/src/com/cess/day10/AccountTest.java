package com.cess.day10;

public class AccountTest {
	public static void main(String[] args) {
		Customer customer = new Customer("Jane", "Smith");
		customer.setAccount(new Account(1000, 2000, 0.0123));
		
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " 账户id：" +
				customer.getAccount().getId()+ "，账户余额：" + customer.getAccount().getBalance() + 
				"，年利率：" + customer.getAccount().getAnnualInterestRate()*100 + "%");
	}
}
