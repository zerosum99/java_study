package com.company.circum;

public class Circle {
	double rad;
	final double PI;
	
	public Circle(double r) {
		rad =r;
		PI = 3.14;
	}
	
	public double getCircumrerence() {
		return (rad * 2) * PI;
	}

}
