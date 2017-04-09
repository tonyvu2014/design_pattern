package com.tonyvu.designpattern.adapter;

public class RectangleComputation {
	
    public double getArea(double x, double y, double w, double h) {
    	return w*h;
    }
    
    public double getCircumference(double x, double y, double w, double h) {
    	return 2*(w+h);
    }
    
}
