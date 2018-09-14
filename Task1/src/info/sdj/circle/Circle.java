package info.sdj.Circle;

import info.sdj.AbstractShape;
import java.lang.Math;

public class Circle extends AbstractShape {
	
	private int radius;
	
	@Override
	public double getArea() {	
		return Math.pow(radius, 2) * Math.PI;		
	}

	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}



	
}
