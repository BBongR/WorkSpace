package junittest;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import java22.junit.Oper;

public class TestOper {

	private static Oper op = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		op = new Oper(3, 5);

	}

	@Test
	public void testAdd() {

		int rs = op.add();

		// 테스트 코드 작성
		assertEquals(8, rs);
		assertNotEquals(6, rs);

		assertTrue(8 == rs);
		assertFalse(6 == rs);

	}

	@Test
	public void testMinus() {

		int rs = op.minus();

		// 테스트 코드 작성
		assertEquals(-2, rs);
		assertNotEquals(1, rs);

		assertTrue(-2 == rs);
		assertFalse(1 == rs);

	}

	@Test
	public void testMul() {

		int rs = op.mul();

		// 테스트 코드 작성
		assertEquals(15, rs);
		assertNotEquals(3, rs);

		assertTrue(15 == rs);
		assertFalse(3 == rs);

	}

	@Test
	public void testDiv() {

		double rs = op.div();

		// 테스트 코드 작성
		assertEquals(0.6, rs, 0.0);
		assertNotEquals(0.2, rs, 0.0);

		assertTrue(0.6 == rs);
		assertFalse(0.2 == rs);
	}

}
