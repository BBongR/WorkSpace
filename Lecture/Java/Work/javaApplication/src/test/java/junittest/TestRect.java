package junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {

	private static Rect rc = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		rc = new Rect(3, 5);

	}

	@Test
	public void testArea() {

		rc.setWidth(3);
		rc.setHeight(5);
		int rs = rc.area();

		assertEquals(15, rs);
		assertNotEquals(12, rs);

		assertTrue(15 == rs);
		assertFalse(12 == rs);

	}

	@Test
	public void testPerimeter() {

		rc.setWidth(2);
		rc.setHeight(7);
		int rs = rc.perimeter();

		assertEquals(18, rs);
		assertNotEquals(13, rs);

		assertTrue(18 == rs);
		assertFalse(13 == rs);
	}

}
