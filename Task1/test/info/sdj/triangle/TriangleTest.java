package info.sdj.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testGetArea() {
		
		Triangle triangle = new Triangle();
		
		assertNotNull(triangle.getArea());
		triangle.setTriangleHight(1);
		triangle.setTriangleSide(1);
		assertEquals(0.5, triangle.getArea(), 0.1);
	}

}
