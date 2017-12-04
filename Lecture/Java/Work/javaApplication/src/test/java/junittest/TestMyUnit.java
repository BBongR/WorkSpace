package junittest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMyUnit {

	static MyUnit myUnit = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myUnit = new MyUnit();
	}

	@Test
	public void testConcate() {

		String rs = myUnit.concate("삼각", "김밥");

		assertNotNull(rs);

		assertEquals("삼각김밥", rs);
		assertNotEquals("사각김밥", rs);

		assertTrue("삼각김밥".equals(rs));
		assertFalse("사각김밥".equals(rs));

	}

	@Test
	public void testGetBoolean() {

		boolean rs = myUnit.getBoolean();

		assertFalse(rs);

	}

	@Test
	public void testGetSameObject() {

		Object rs = myUnit.getSameObject();

	}

	@Test
	public void testGetObject() {

		Object rs = myUnit.getObject();

		assertNull(rs);
		assertEquals(null, rs);

	}

	@Test
	public void testGetStringArray() {

		String[] rs = myUnit.getStringArray();
		String[] as = { "one", "two", "three" };

		assertNotNull(rs); // 인스턴스 검증
		assertArrayEquals(as, rs); // 값 검증

	}

	@Test(expected = ArithmeticException.class)
	public void testGetException() {

		myUnit.getException();

	}

	// @Test 목록에도 안나오고 테스트도 안함
	// @Ignore 목록에는 회색으로 나오나 테스트는 하지 않음
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetEmptyList() {

		ArrayList<String> rs = myUnit.getEmptyList();
		rs.get(0);

	}

}
