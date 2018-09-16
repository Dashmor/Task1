package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import info.sdj.triangle.Triangle;

class TriangleTest {

	@Test
	void test() {
		Triangle test = new Triangle();
		test.setTriangleHight(6);
		test.setTriangleSide(3);
		assertEquals(9, test.getArea());
	}

}
