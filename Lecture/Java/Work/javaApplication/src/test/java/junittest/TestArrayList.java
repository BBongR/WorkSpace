package junittest;

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
		assertNotEquals(null, elist);

	}

	// 문제2. 테스트 메서드명: test02
	// JUnit을 이용하여 elist의 갯수가 5인지를 검증하는 테스트 코드를 작성하시오
	@Test
	public void test02() {

		assertNotNull(elist);
		assertEquals(5, elist.size());
		assertNotEquals(6, elist.size());

	}

	// 문제3. 테스트 메서드명: test03
	// JUnit을 이용하여 elist에 10이 존재하지 않음을 검증하는 테스트 코드를 작성하시오
	@Test
	public void test03() {

		assertNotNull(elist);
		
		int rs = elist.indexOf("10");
		
		assertEquals(-1, rs);
		System.out.println(rs);
		
		// indexOf
		// 문자열 중 입력받은 문자가 있으면 해당 문자의 위치(index) 값을 리턴하고
		// 문자가 없으면 -1을 리턴한다. 문자열 조회는 index 값 0 부터 시작( 왼쪽 부터 읽기 시작함)

		// lastIndexOf ( indexOf와 반대로 오른쪽 부터 읽기 시작함 )

		boolean b = elist.contains("10");
		assertEquals(false, b);
		assertFalse(b);
		// System.out.println(elist.contains("3"));
		// System.out.println(elist.contains("10"));

		// contains( ) 메서드는 특정 문자열이 포함되어 있는지 확인하는 기능을 한다.
		// 특정 문자열이 포함되어 있다면 true를 없다면 false를 반환한다.

	}

	// 문제4. 테스트 메서드명: test04
	// JUnit을 이용하여 두 배열이 같음을 검증하는 테스트 코드를 작성하시오
	@Test
	public void test04() {

		String[] names1 = { "y2kpooh", "hwang" };
		String[] names2 = { "y2kpooh", "hwang" };

		assertArrayEquals(names1, names2);
	}

}
