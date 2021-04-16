package com.cess.day15;

/*
 * （1）定义一个Employee类，该类包含：
private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
abstract方法earnings()；
toString()方法输出对象的name,number和birthday。
 */
public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;

	public abstract double earnings();

	public String tostring() {
		return "name:" + name + ", number:" + number + ",birthday:" + birthday;
	}

	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

}
