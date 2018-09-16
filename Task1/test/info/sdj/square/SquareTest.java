package info.sdj.square;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SquareTest {

	@Test
	void testGetArea() {
		
		Square square = new Square();
		
		square.setSideLength(6.2);
		assertNotNull(square.getArea());
		assertEquals(38, square.getArea(), 0.5);
		
	}

}
