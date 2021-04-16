package com.cess.day15;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hour;

	@Override
	public double earnings() {
		return wage * hour;
	}

	public String toString() {
		return "name:" + getName() + ", number:" + getNumber() + ",birthday:" + getBirthday();

	}

	public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	
	

}
