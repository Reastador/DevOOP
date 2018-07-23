package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lessons.triangle.Triangle;

public class TriangleTest {

	@Test
	public void test() {
		Triangle test = new Triangle();
		test.setHight(6);
		test.setSideA(12);
		int result = test.getArea();
		assertEquals(36, result);
	}

}
