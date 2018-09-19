package info.sdj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import info.sdj.circle.Circle;
import info.sdj.parallelogram.Parallelogram;
import info.sdj.rectangle.Rectangle;
import info.sdj.square.Square;
import info.sdj.triangle.Triangle;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setFirstSide(1);
		rectangle.setSecondSide(1);
		
		Parallelogram parallelogram = new Parallelogram();
		parallelogram.setpHeight(9);
		parallelogram.setpSide(11);
		
		Circle circle = new Circle();
		circle.setRadius(13);

	
		Square square = new Square();
		square.setSideLength(67);
	
		
		Triangle triangle = new Triangle();
		triangle.setTriangleHight(111);
		triangle.setTriangleSide(98);
		
		
		List<Shape>list = new ArrayList<Shape>();
		list.add(triangle);
		list.add(square);
		list.add(circle);
		list.add(parallelogram);
		list.add(rectangle);
		
		Shape maxShape = list.get(0); 
		Shape minShape = list.get(0);
		
	
		for(Shape shape: list) {
			if(shape.getArea() > maxShape.getArea()) {
				maxShape = shape;
			}
			
			if(shape.getArea() < minShape.getArea()) {
				minShape = shape;			
			}			
		}
		
		
		logger.info("the max area is: " + maxShape.getArea() + " The figure is: " + maxShape.getClass().getSimpleName());
	

		logger.info("the min area is: " + minShape.getArea() + " The figure is: " + minShape.getClass().getSimpleName() );
	}
	
}