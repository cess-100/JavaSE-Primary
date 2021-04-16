package com.cess.day12;

public class CheckAccount extends Account {
	private double overdraft;//

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
//			setBalance(getBalance() - amount);
			super.withdraw(amount);
		} else {
			double limit = amount - getBalance();
			if (limit < overdraft) {
				setBalance(0);
				overdraft -= limit;
			} else {
				System.out.println("超过可透支额的限额");
			}
		}
		System.out.println("账户余额为：" + getBalance());
		System.out.println("可透支额度为：" + overdraft + "\n");
	}

}
