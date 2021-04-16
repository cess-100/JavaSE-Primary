package com.cess.day12;

/*
 * 1、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
deposit()。
 */
public class Account {
	private int id;
	private double balance;
	private double annualIntersetRate;

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualIntersetRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntersetRate() {
		return annualIntersetRate;
	}

	public void setAnnualIntersetRate(double annualIntersetRate) {
		this.annualIntersetRate = annualIntersetRate;
	}

	public double getMonthlyInterest() {
		return annualIntersetRate / 12;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("余额不足");
		}
		System.out.println("您的余额为：" + balance);
		System.out.println();
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("您的余额为：" + balance);
		System.out.println("月利率为：" + getMonthlyInterest());
		System.out.println();
	}

}
