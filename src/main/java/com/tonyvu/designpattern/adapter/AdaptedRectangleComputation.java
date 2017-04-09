package com.tonyvu.designpattern.adapter;

public class AdaptedRectangleComputation implements RectangleComputationAdapter {
	
	private RectangleComputation rectangleComputattion;
	
	public AdaptedRectangleComputation(RectangleComputation rectangleComputattion) {
		this.rectangleComputattion = rectangleComputattion;
	}

	@Override
	public double getArea(double x1, double y1, double x2, double y2) {
		return rectangleComputattion.getArea(x1, y1, x2-x1, y2-y1);
	}

	@Override
	public double getCircumference(double x1, double y1, double x2, double y2) {
		return rectangleComputattion.getCircumference(x1, y1, x2-x1, y2-y1);
	}

}
