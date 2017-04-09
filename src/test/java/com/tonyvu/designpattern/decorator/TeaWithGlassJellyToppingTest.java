package com.tonyvu.designpattern.decorator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeaWithGlassJellyToppingTest {
	
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
        TeaWithTopping teaWithGlassJellyTopping = new TeaWithGlassJellyTopping(simpleTea);
        
        assertEquals(teaWithGlassJellyTopping.getName(), "Green Milk Tea, topped with Glass Jelly");
	}
	
	@Test
	public void testGetPrice() {
        TeaWithTopping teaWithGlassJellyTopping = new TeaWithGlassJellyTopping(simpleTea);
        
        assertEquals(teaWithGlassJellyTopping.getPrice().compareTo(BigDecimal.valueOf(4.5).add(TeaWithGlassJellyTopping.GLASS_JELLY_TOPPING_PRICE)), 0);
	}

}
