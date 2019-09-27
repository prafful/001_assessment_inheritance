package com.assignment.inheritance.repository;

import com.assignment.inheritance.pojo.Circle;
import com.assignment.inheritance.pojo.Cylinder;

public class Shapes {
			
		Circle circle = new Circle(5);
		Cylinder cylinder = new Cylinder(4, 5);  //
	
		public Circle createCircle() {
			return circle;
		}
		
		public Cylinder createCylinder() {
			return cylinder;
		}

}
