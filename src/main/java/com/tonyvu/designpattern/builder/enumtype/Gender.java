package com.tonyvu.designpattern.builder.enumtype;

public enum Gender {
	
	MALE("male"),
	FEMALE("female");
	
	private final String description;
	
	private Gender(String description) {
		this.description = description;
	}

}
