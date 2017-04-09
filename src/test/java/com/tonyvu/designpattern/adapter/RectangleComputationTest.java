package com.tonyvu.designpattern.adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleComputationTest {
	
	private RectangleComputation rectangleComputation;
	private AdaptedRectangleComputation adaptedRectangleComputation;

	@Before
	public void setUp() throws Exception {
		rectangleComputation = new RectangleComputation();
		adaptedRectangleComputation = new AdaptedRectangleComputation(rectangleComputation);
	}

	@After
	public void tearDown() throws Exception {
		rectangleComputation = null;
		adaptedRectangleComputation = null;
	}

	@Test
	public void testGetArea() {
		assertEquals(adaptedRectangleComputation.getArea(1, 1, 3, 5), 8, 0);
	}
	
	@Test
	public void testGetCircumference() {
		assertEquals(adaptedRectangleComputation.getCircumference(1, 1, 3, 5), 12, 0);
	}

}
