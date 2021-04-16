package com.cess.day17.domain;

public class Architect extends Designer {
	private int stock;

	public Architect() {
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String getInfo() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师\t" + getStatus().getNAME()
				+ "\t" + +getBonus() + "\t" + stock;
	}

	@Override
	public String toString() {
		return getInfo() + "\t" + getEquipment().getDescription();
	}

}
