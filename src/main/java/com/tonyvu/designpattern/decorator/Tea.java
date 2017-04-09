package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

import com.tonyvu.designpattern.decorator.enumtype.Size;
import com.tonyvu.designpattern.decorator.enumtype.SugarLevel;

public interface Tea {
	
	public String getName();
	public void setName(String name);
	public String getFlavour();
	public void setFlavour(String flavour);
	public BigDecimal getPrice();
	public void setPrice(BigDecimal price);
	public Size getSize();
	public void setSize(Size size);
	public SugarLevel getSugarLevel();
	public void setSugarLevel(SugarLevel sugarLevel);

}
