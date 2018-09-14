package info.sdj.Triangle;

import info.sdj.AbstractShape;

public class Triangle extends AbstractShape {
	
	private double triangleSide;
	private double triangleHight;
	
	
	@Override
	public double getArea() {
		return (triangleSide * triangleHight) / 2;		
	}
	
	

	public double getTriangleSide() {
		return triangleSide;
	}



	public void setTriangleSide(double triangleSide) {
		this.triangleSide = triangleSide;
	}



	public double getTriangleHight() {
		return triangleHight;
	}



	public void setTriangleHight(double triangleHight) {
		this.triangleHight = triangleHight;
	}



	/*void erase();
	void draw();
	void move();
	void getColor();
	void setColor();*/
	
}
