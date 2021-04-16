package com.cess.day14;
/*
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
码”、“存款余额”、“利率”、“最小余额”，定义封装这些
属性的方法。账号要自动生成。
编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。
 */
public class Account {
	private int id;
	private String password = "000000";
	private double banlance;
	private static double interest;
	private static double minBalance;
	private static int init = 1000;//用于自动生成id
	
	public Account() {
		id = init++;
	}

	public Account(String password, double banlance) {
		this();
		this.id = id;
		this.password = password;
		this.banlance = banlance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public double getBanlance() {
		return banlance;
	}

	public static double getInterest() {
		return interest;
	}

	public static double getMinBalance() {
		return minBalance;
	}

	public static void setInterest(double interest) {
		Account.interest = interest;
	}

	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}
}
