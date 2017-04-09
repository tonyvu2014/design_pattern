package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

public class TeaWithIceCreamTopping extends TeaWithTopping {
	
	public static final BigDecimal ICE_CREAM_TOPPING_PRICE = BigDecimal.valueOf(1.50);

	public TeaWithIceCreamTopping(Tea tea) {
		super(tea);
	}

	@Override
	public String getName() {
		return String.format("%s, topped with Ice Cream", super.getName());
	}

	@Override
	public BigDecimal getPrice() {
		return super.getPrice().add(ICE_CREAM_TOPPING_PRICE);
	}
	
}
