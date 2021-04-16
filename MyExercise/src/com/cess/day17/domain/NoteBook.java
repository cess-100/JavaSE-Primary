package com.cess.day17.domain;

public class NoteBook implements Equipment {
	private String model;
	private double price;

	public NoteBook() {
		super();
	}

	public NoteBook(String model, double price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String getDescription() {
		return model + "(" + price + ")";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}