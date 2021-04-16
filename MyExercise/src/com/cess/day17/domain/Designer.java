package com.cess.day17.domain;

public class Designer extends Programmer {
	private double bonus;

	public Designer() {
	}

	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String getInfo() {
		return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师\t" + getStatus().getNAME()
				+ "\t" + bonus;
	}

	@Override
	public String toString() {
		return getInfo() + "\t\t" + getEquipment().getDescription();
	}

}
