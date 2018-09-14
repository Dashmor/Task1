package info.sdj;

import java.util.logging.Logger;
import info.sdj.circle.Circle;
import info.sdj.square.Square;
import info.sdj.triangle.Triangle;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(13);
		logger.info("The area of the circle is: "+ circle.getArea());
	
		Square square = new Square();
		square.setSideLength(67);
		logger.info("The area of the square is: " + square.getArea());
	
		
		Triangle triangle = new Triangle();
		triangle.setTriangleHight(4);
		triangle.setTriangleSide(98);
		logger.info("The area of the triangle is: " + triangle.getArea() );
		
	}

}
