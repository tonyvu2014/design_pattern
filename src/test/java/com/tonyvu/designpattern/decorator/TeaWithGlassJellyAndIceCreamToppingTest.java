package com.tonyvu.designpattern.decorator;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeaWithGlassJellyAndIceCreamToppingTest {

	private Tea simpleTea;

	@Before
	public void setUp() throws Exception {
		simpleTea = new SimpleTea();
		simpleTea.setName("Green Milk Tea");
		simpleTea.setPrice(BigDecimal.valueOf(4.50));
	}

	@After
	public void tearDown() throws Exception {
		simpleTea = null;
	}

	@Test
	public void testGetName() {
        TeaWithTopping teaWithGlassJellyAndIceCreamTopping = new TeaWithIceCreamTopping(new TeaWithGlassJellyTopping(simpleTea));
        
        assertEquals(teaWithGlassJellyAndIceCreamTopping.getName(), "Green Milk Tea, topped with Glass Jelly, topped with Ice Cream");
	}
	
	@Test
	public void testPrice() {
        TeaWithTopping teaWithGlassJellyAndIceCreamTopping = new TeaWithIceCreamTopping(new TeaWithGlassJellyTopping(simpleTea));

        assertEquals(teaWithGlassJellyAndIceCreamTopping.getPrice()
        		.compareTo(BigDecimal.valueOf(4.5)
        		.add(TeaWithGlassJellyTopping.GLASS_JELLY_TOPPING_PRICE)
        		.add(TeaWithIceCreamTopping.ICE_CREAM_TOPPING_PRICE)), 
        		0);
	}

}
