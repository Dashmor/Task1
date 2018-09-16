package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import info.sdj.circle.Circle;

class CircleTest {

	@Test
	void test() {
		Circle test = new Circle();
		test.setRadius(5);
		assertEquals(78.53981633974483, test.getArea());
	}

}
