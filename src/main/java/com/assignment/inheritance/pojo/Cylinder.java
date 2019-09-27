package com.assignment.inheritance.pojo;

public class Cylinder {

	   // private instance variable
	   private double height;
	   
	   // Constructors
	   public Cylinder() {
	      // invoke superclass' constructor Circle()
	      this.height = 1.0;
	   }
	   public Cylinder(double height) {
	      // invoke superclass' constructor Circle()
	      this.height = height;
	   }
	   public Cylinder(double height, double radius) {
	      // invoke superclass' constructor Circle(radius)
	      this.height = height;
	   }
	   
	   
	   // Getter and Setter
	   public double getHeight() {
	      return this.height;
	   }
	   public void setHeight(double height) {
	      this.height = height;
	   }

	   // Return the volume of this Cylinder
	   // Return type must be double
	   public double getVolume() {
	      // Use Circle's getArea() * height
		   return 0;
	   }

	   
	   public String toString() {
	      return "This is a Cylinder";  
	   }
	
}
