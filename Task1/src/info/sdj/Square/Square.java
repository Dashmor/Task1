package info.sdj.Square;

import info.sdj.AbstractShape;
import java.lang.Math;

public class Square extends AbstractShape {
	
	private double sideLength;
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	
	@Override
	public double getArea() {
		return Math.pow(sideLength, 2);
	}
	
	
	

}
