package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import info.sdj.square.Square;

class SquareTest {

	@Test
	void test() {
		Square test = new Square();
		test.setSideLength(4);
		assertEquals(16, test.getArea());
	}

}
