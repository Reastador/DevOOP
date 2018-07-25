package squaretest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lessons.square.Square;

public class SquareTest {

	@Test
	public void test() {
		Square test = new Square();
		test.setSide(20);
		int result = test.getArea();
		assertEquals( 400 , result );
	}

}
