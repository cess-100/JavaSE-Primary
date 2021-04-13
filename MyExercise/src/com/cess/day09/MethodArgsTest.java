package com.cess.day09;

public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		System.out.println(test.f(40));
	}

	public int f(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}
}
