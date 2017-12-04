package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {

	static List<String> elist = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		elist = new ArrayList<String>();
		elist.add("0");
		elist.add("2");
		elist.add("1");
		elist.add("3");
		elist.add("4");
	}

	// 문제1. 테스트 메서드명: test01
	// JUnit을 이용하여 elist가 null이 아님을 검증하는 테스트 코드를 작성하시오
	@Test
	public void test01() {
		assertNotNull(elist);
	}

	// 문제2. 테스트 메서드명: test02
	// JUnit을 이용하여 elist의 갯수가 5인지를 검증하는 테스트 코드를 작성하시오
	@Test
	public void test02() {
		assertEquals(5, elist.size());
	}

	// 문제3. 테스트 메서드명: test03
	// JUnit을 이용하여 elist에 10이 존재하지 않음을 검증하는 테스트 코드를 작성하시오
	@Test
	public void test03() {
		int result = elist.indexOf("10");
		assertEquals(-1, result); // 1번째방법

		boolean b = elist.contains("10");
		assertEquals(false, b); // 2번째방법
		assertFalse(b); // 3번째방법
	}

	// 문제4. 테스트 메서드명: test04
	// JUnit을 이용하여 두 배열이 같음을 검증하는 테스트 코드를 작성하시오
	@Test
	public void test04() {
		String names1[] = { "y2kpooh", "hwang" };
		String names2[] = { "y2kpooh", "hwang" };

		assertArrayEquals(names1, names2);
	}

}
