package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

import com.tonyvu.designpattern.decorator.enumtype.Size;
import com.tonyvu.designpattern.decorator.enumtype.SugarLevel;

public class SimpleTea implements Tea {
	
	private String name;
	private String flavour;
	private Size size;
	private SugarLevel sugarLevel;
	private BigDecimal price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	
	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}
	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
