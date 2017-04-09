package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

public class TeaWithGoldenBubbleTopping extends TeaWithTopping {
	
	public static final BigDecimal GOLDEN_BUBBLE_TOPPING_PRICE = BigDecimal.valueOf(1.30);

	public TeaWithGoldenBubbleTopping(Tea tea) {
		super(tea);
	}
	
	@Override
	public String getName() {
		return String.format("%s, topped with Golden Bubble", super.getName());
	}
	
	@Override
	public BigDecimal getPrice() {
		return super.getPrice().add(GOLDEN_BUBBLE_TOPPING_PRICE);
	}

}
