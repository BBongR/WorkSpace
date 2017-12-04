package java22.junit;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {

	static Oper op = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		op = new Oper(5, 8);
	}

	@Test
	public void test() {
//		boolean a = false;
//		assertTrue(a);
		
//		String s = null;
//		assertNull(s);
		op.minus();
		op.mul();
		op.div();
	}

}
