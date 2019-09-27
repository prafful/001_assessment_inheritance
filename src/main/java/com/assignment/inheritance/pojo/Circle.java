package com.assignment.inheritance.pojo;

public class Circle {

	private double radius;

	// Constructors
	public Circle() {
		this.radius = 1.0;

	}

	public Circle(double radius) {
		this.radius = radius;

	}

	// Getters and Setters
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle [Radius=" + radius + "]";
	}

	// Return the area of this Circle
	public double getArea() {
		// implement a formula to calculate the area and return the same
		// area_of_circle = PI x (radius  x radius)
		return 0;
		
	}

}
