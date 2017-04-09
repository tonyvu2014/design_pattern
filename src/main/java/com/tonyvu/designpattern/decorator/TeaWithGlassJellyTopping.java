package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

public class TeaWithGlassJellyTopping extends TeaWithTopping {
	
	public static final BigDecimal GLASS_JELLY_TOPPING_PRICE = BigDecimal.valueOf(1.20);

	public TeaWithGlassJellyTopping(Tea tea) {
		super(tea);
	}
	
	@Override
	public String getName() {
		return String.format("%s, topped with Glass Jelly", super.getName());
	}
	
	@Override
	public BigDecimal getPrice() {
		return super.getPrice().add(GLASS_JELLY_TOPPING_PRICE);
	}

}
