package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {

	static Student stu = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Student 클래스의 인스턴스 생성
		stu = new Student();
	}

	@Test
	public void test() {
		stu.getGrade(101); // A
		stu.getGrade(99); // A
		stu.getGrade(89); // B
		stu.getGrade(80); // B

		assertEquals("A", stu.getGrade(101));
		assertEquals("A", stu.getGrade(99));
		assertEquals("A", stu.getGrade(90));

		assertEquals("B", stu.getGrade(89));
		assertEquals("B", stu.getGrade(80));

		assertEquals("C", stu.getGrade(79));
		assertEquals("C", stu.getGrade(70));

		assertEquals("D", stu.getGrade(69));
		assertEquals("D", stu.getGrade(60));

		assertEquals("F", stu.getGrade(59));
		assertEquals("F", stu.getGrade(0));
	}

}
