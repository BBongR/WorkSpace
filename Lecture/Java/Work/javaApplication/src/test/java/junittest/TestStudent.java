package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {

	static Student stu = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		stu = new Student();

	}

	@Test
	public void testGetgrade() {

		assertEquals("A", stu.getgrade(100));
		assertEquals("A", stu.getgrade(90));
		
		assertEquals("B", stu.getgrade(89));
		assertEquals("B", stu.getgrade(80));
		
		assertEquals("C", stu.getgrade(79));
		assertEquals("C", stu.getgrade(70));
		
		assertEquals("D", stu.getgrade(69));
		assertEquals("D", stu.getgrade(60));
	}

}
