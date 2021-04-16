package com.cess.day12;

public class CheckAccoutTest {
	public static void main(String[] args) {
		CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
		checkAccount.withdraw(5000);
		checkAccount.withdraw(18000);
		checkAccount.withdraw(3000);
	}
}
