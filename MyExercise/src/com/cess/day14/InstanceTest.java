package com.cess.day14;

public class InstanceTest {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		System.out.println(b instanceof A);
		System.out.println(b instanceof C);
	}
	

}

class A {}
class B extends A{}
class C extends B{}
