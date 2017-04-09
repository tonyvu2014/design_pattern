package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

import com.tonyvu.designpattern.decorator.enumtype.Size;
import com.tonyvu.designpattern.decorator.enumtype.SugarLevel;

public abstract class TeaWithTopping implements Tea {
	
	protected Tea tea;
	
	public TeaWithTopping(Tea tea) {
		this.tea = tea;
	}

	public String getName() {
		return this.tea.getName();
	}
	
	public void setName(String name) {
		this.tea.setName(name);
	}

	public String getFlavour() {
		return this.tea.getFlavour();
	}
	
	public void setFlavour(String flavour) {
		this.tea.setFlavour(flavour);
	}

	public BigDecimal getPrice() {
		return this.tea.getPrice();
	}
	
	public void setPrice(BigDecimal price) {
		this.tea.setPrice(price);
	}

	public Size getSize() {
		return this.tea.getSize();
	}
	
	public void setSize(Size size) {
		this.tea.setSize(size);
	}

	public SugarLevel getSugarLevel() {
		return this.tea.getSugarLevel();
	}
	
	public void setSugarLevel(SugarLevel sugarLevel) {
		this.tea.setSugarLevel(sugarLevel);
	}
	
}
