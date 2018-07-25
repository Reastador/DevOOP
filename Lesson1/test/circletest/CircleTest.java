package circletest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lessons.circle.Circle;

public class CircleTest {

	@Test
	public void test() {
		Circle test = new Circle();
		test.setRadius(20);
		int result = test.getArea();
		assertEquals(1256 , result);
	}

}
