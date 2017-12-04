package java23.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceBook {
	private static ServiceBook svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		svr = new ServiceBook();
	}

	@Test
	public void testGetCount() throws SQLException {

		ModelBook model = new ModelBook();
		int result = svr.getCount(model);
		assertEquals(4, result);

	}

	@Test
	public void testGetMaxBookid() throws SQLException {
		int result = svr.getMaxBookid();
		assertEquals(4, result);
	}

	@Test
	public void testSelectAll() throws SQLException {
		ResultSet result = svr.selectAll();
		result.next();
		Integer bi = result.getInt("bookid");
		String bn = result.getString("bookname");
		assertEquals("operating system", bn);
		assertSame(1, bi);
		result.next();
		bi = result.getInt("bookid");
		assertSame(2, bi);
		assertNotNull(result);
	}

	@Test
	public void testSelectLike() throws SQLException {
		ModelBook book = new ModelBook();
		book.setBookname("ja");
		java.sql.ResultSet rs = svr.selectLike(book);

		// resultset을 이용한 검증
		assertNotNull(rs);
		// assertTrue(rs.getRow()>=1); // 커서가 가르키는 위치
		rs.getRow(); // ResultSet 에 들어있는 row의 총 수. 레코드 수

		// 값을 이용한 검증
		rs.next(); // 커서가 첫번째 row로 이동.
		String name = rs.getString("bookname"); // java
		assertTrue(name.contains("ja"));
		assertTrue(name.contains(book.getBookname()));

	}

	@Test
	public void testSelectEqual() throws SQLException {

		ModelBook book = new ModelBook();
		book.setBookname("mysql");

		java.sql.ResultSet rs = svr.selectEqual(book);

		// resultset을 이용한 검증
		assertNotNull(rs);

		// 값을 이용한 검증
		rs.next(); // 커서가 첫번째 row로 이동.
		String name = rs.getString("bookname"); // mysql
		assertTrue(name.contains("mysql"));
		assertTrue(name.contains(book.getBookname()));

	}

	@Test
	public void testSelectDynamic() throws SQLException {
		ModelBook book = new ModelBook();

		// 첫번째 검증. select * from book where 1=1;
		// select count(*) from book where 1=1;
		book.setBookid(null);
		book.setBookname("");
		java.sql.ResultSet rs = svr.selectDynamic(book);

		assertNotNull(rs); // 인스턴스 검증
		rs.last(); // 커서의 위치를 마지막 row로 이동.
		int rows = rs.getRow(); // 현재 커서의 index 번호를 가져온다
		assertEquals(svr.getCount(book), rows);
		// resultset 사용법
		// rs.next(); 커서를 현재 row에서 다음 row로 이동.
		// rs.last(); 마지막 row로 이동.
		// rs.first(); 첫번째 row로 이동.
		// rs.getRow(); 현재 커서의 index 번호
		// rs.getInt("컬럼명");
		// rs.getStirng("컬럼명");
		// rs.getBoolean("컬럼명");
		// rs.getDate("컬럼명");

		// 두번째 검증.
		book.setBookid(1);
		book.setBookname("");
		rs = svr.selectDynamic(book);

		// 인스턴스 검증
		assertNotNull(rs);

		// 값으로 검증.
		rs.next(); // 커서의 위치를 다음 row로 이동.
		int bookid = rs.getInt("bookid");
		String bookname = rs.getString("bookname");

		assertEquals(1, bookid);
		assertSame(book.getBookid(), bookid);
		assertEquals("operating system", bookname);

		// 세번째 검증
		book.setBookid(null);
		book.setBookname("java");
		rs = svr.selectDynamic(book);

		// 인스턴스 검증
		assertNotNull(rs);

		// 값으로 검증.
		rs.next(); // 커서의 위치를 다음 row로 이동.
		rs.first(); // 커서의 위치를 처음 row로 이동.
		bookid = rs.getInt("bookid");
		bookname = rs.getString("bookname");

		assertEquals(3, bookid);
		assertEquals("java", bookname);

		// 네번째 검증. select * from book where 1=1 and bookid = 2 and bookname ='mysql';
		book.setBookid(2);
		book.setBookname("mysql");
		rs = svr.selectDynamic(book);

		assertNotNull(rs);

		rs.next();
		rs.first();
		bookid = rs.getInt("bookid");
		bookname = rs.getString("bookname");

		assertEquals(2, bookid);
		assertEquals("mysql", bookname);

	}

	@Test
	public void testInsertBook() throws SQLException {
		java.util.Date date = new java.util.Date(117, 10, 8);
		java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");

		ModelBook book = new ModelBook();
		book.setBookname("test");
		book.setPublisher("abc");
		book.setYear("2017");
		book.setPrice(20000);
		book.setDtm(date2);
		book.setUse_yn(true);
		book.setAuthid(3);

		int result = svr.insertBook(book);

		// insert 검증 :
		// 1 리턴되는 경우 : insert 성공
		// 0 리턴되는 경우 : insert 실패
		assertEquals(1, result);

	}

	@Test
	public void testUpdateBook() throws SQLException {
		ModelBook wherebook = new ModelBook();
		wherebook.setBookname("test");

		ModelBook setbook = new ModelBook();
		setbook.setPrice(15000);
		setbook.setYear("2016");

		int result = svr.updateBook(wherebook, setbook);

		// 검증 코드
		// 1 이상의 값이 리턴되는 경우 : 성공
		// 0 값이 리턴되는 경우 : 성공
		assertTrue(result >= 0);

	}

	@Test
	public void testDeleteBook() throws SQLException {
		ModelBook book = new ModelBook();
		book.setBookname("test");

		int result = svr.deleteBook(book); // result == 1

		// 검증 코드
		// 1 이상의 값이 리턴되는 경우 : 성공
		// 0 값이 리턴되는 경우 : 성공
		assertTrue(result >= 0);

		book.setBookname("test2");
		result = svr.deleteBook(book); // result == 0

		// 검증 코드
		// 1 이상의 값이 리턴되는 경우 : 성공
		// 0 값이 리턴되는 경우 : 성공
		assertTrue(result >= 0);

	}

	@Test
	public void testTransCommit() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransRollback() {
		fail("Not yet implemented");
	}

}