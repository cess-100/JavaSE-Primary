package com.cess.day10;

public class TriAngle {
	private double base;
	private double height;
	
	public TriAngle() {}
	
	public TriAngle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
}
