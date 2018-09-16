package info.sdj.circle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle();
		
		assertNotNull(circle.getArea());
		circle.setRadius(2);
		assertEquals(12.56, circle.getArea(), 0.1);
	}

}
