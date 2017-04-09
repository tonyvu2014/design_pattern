package com.tonyvu.designpattern.decorator.enumtype;

public enum SugarLevel {
	
	QUARTER("25%"),
	HALF("50%"),
	LESS("75%"),
	FULL("100%");
	
	private final String description;
	
	private SugarLevel(String description) {
		this.description = description;
	}
	
	@Override
    public String toString() {
    	return this.description;
    }
}
