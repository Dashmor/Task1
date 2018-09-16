package info.sdj.square;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class SquareTest {

	@Test
	void testGetArea() {
		
		Square square = new Square();
		
		assertNotNull(square.getArea());
		square.setSideLength(6.2);
		assertEquals(38, square.getArea(), 0.5);
		
	}

}
