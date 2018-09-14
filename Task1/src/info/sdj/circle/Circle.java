package info.sdj.circle;

import java.lang.Math;
import info.sdj.AbstractShape;

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
