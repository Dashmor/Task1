package info.sdj.rectangle;

import info.sdj.AbstractShape;

public class Rectangle extends AbstractShape {
	
	private double firstSide;
	private double secondSide;

	

	public double getFirstSide() {
		return firstSide;
	}



	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}



	public double getSecondSide() {
		return secondSide;
	}



	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}



	@Override
	public double getArea() {
		return firstSide*secondSide;
		
	}
	
}
