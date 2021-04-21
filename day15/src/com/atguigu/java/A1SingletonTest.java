package com.atguigu.java;

public class A1SingletonTest {
	public static void main(String[] args) {
		
		Bank bank1 = Bank.instance;
		
//		Bank.instance = null;
		Bank bank2 = Bank.instance;
		
		System.out.println(bank1 == bank2);
		
	}
}

class Bank{
	public static final Bank instance = new Bank();

	private Bank(){
	}
}
