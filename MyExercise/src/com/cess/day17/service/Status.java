package com.cess.day17.service;

import javax.print.attribute.standard.MediaSize.NA;

public class Status {
	private final String NAME;

	public static final Status FREE = new Status("FREE");
	public static final Status VACATION = new Status("VACATION");
	public static final Status BUSY = new Status("BUSY");

	private Status(String name) {
		this.NAME = name;
	}

	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return NAME;
	}

	@Override
	public boolean equals(Object s) {
		return (NAME == s);
	}
	
	
}
