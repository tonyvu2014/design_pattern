package com.tonyvu.designpattern.decorator.enumtype;

public enum Size {
	
	SMALL("small"),
	MEDIUM("medium"),
	BIG("big");
	
	private final String description;
	
	private Size(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.description;
	}

}
