package info.sdj.circle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle();
		
		circle.setRadius(2);
		assertNotNull(circle.getArea());
		assertEquals(12.56, circle.getArea(), 0.1);
	}

}
