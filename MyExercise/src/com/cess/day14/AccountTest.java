package com.cess.day14;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void test() {
		Account.setInterest(0.02);
		Account.setMinBalance(1000);
		Account a1 = new Account("123123", 10000);
		Account a2 = new Account("123234", 20000);
		Account a3 = new Account("123345", 30000);
	}
}
