package info.sdj.parallelogram;

import info.sdj.AbstractShape;

public class Parallelogram extends AbstractShape{

	private double pHeight;
	private double pSide;
	
	public double getpHeight() {
		return pHeight;
	}


	public void setpHeight(double pHeight) {
		this.pHeight = pHeight;
	}



	public double getpSide() {
		return pSide;
	}



	public void setpSide(double pSide) {
		this.pSide = pSide;
	}



	@Override
	public double getArea() {
		return pHeight*pSide;
	}

	
}
